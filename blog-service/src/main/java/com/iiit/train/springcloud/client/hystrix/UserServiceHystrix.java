package com.iiit.train.springcloud.client.hystrix;

import com.iiit.train.springcloud.client.UserServiceClient;
import com.iiit.train.springcloud.dto.RespDTO;
import com.iiit.train.springcloud.entity.User;
import org.springframework.stereotype.Component;


/**
 * Created by reng on 2017/5/31.
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
