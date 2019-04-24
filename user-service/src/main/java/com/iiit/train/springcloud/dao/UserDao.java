package com.iiit.train.springcloud.dao;


import com.iiit.train.springcloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by reng on 2017/5/27.
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
