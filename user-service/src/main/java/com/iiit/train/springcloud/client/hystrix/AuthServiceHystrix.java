package com.iiit.train.springcloud.client.hystrix;


import com.iiit.train.springcloud.client.AuthServiceClient;
import com.iiit.train.springcloud.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * Created by reng on 2017/5/31.
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("--------opps getToken hystrix---------");
        return null;
    }
}
