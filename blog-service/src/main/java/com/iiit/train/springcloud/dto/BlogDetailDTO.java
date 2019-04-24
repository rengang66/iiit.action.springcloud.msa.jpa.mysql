package com.iiit.train.springcloud.dto;

import com.iiit.train.springcloud.entity.Blog;
import com.iiit.train.springcloud.entity.User;

/**
 * Created by reng on 2017/7/10.
 */
public class BlogDetailDTO {
    private Blog blog;
    private User user;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
