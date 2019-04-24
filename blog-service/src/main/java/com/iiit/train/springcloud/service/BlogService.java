package com.iiit.train.springcloud.service;


import com.iiit.train.springcloud.client.UserServiceClient;
import com.iiit.train.springcloud.dao.BlogDao;
import com.iiit.train.springcloud.dto.BlogDetailDTO;
import com.iiit.train.springcloud.dto.RespDTO;
import com.iiit.train.springcloud.entity.Blog;
import com.iiit.train.springcloud.entity.User;
import com.iiit.train.springcloud.exception.CommonException;
import com.iiit.train.springcloud.exception.ErrorCode;
import com.iiit.train.springcloud.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by reng on 2017/7/10.
 */
@Service
public class BlogService {

    @Autowired
    BlogDao blogDao;

    @Autowired
    UserServiceClient userServiceClient;

    public Blog postBlog(Blog blog) {
        return blogDao.save(blog);
    }

    public List<Blog> findBlogs(String username) {
        return blogDao.findByUsername(username);
    }


    public BlogDetailDTO findBlogDetail(Long id) {
        Blog blog = blogDao.findOne(id);
        if (null == blog) {
            throw new CommonException(ErrorCode.BLOG_IS_NOT_EXIST);
        }
        RespDTO<User> respDTO = userServiceClient.getUser(UserUtils.getCurrentToken(), blog.getUsername());
        if (respDTO==null) {
            throw new CommonException(ErrorCode.RPC_ERROR);
        }
        BlogDetailDTO blogDetailDTO = new BlogDetailDTO();
        blogDetailDTO.setBlog(blog);
        blogDetailDTO.setUser(respDTO.data);
        return blogDetailDTO;
    }

}
