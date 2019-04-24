package com.iiit.train.springcloud.dto;

import com.iiit.train.springcloud.entity.User;

/**
 * Created by reng on 2017/7/10.
 */
public class LoginDTO {
    private User user;
    private String token;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
