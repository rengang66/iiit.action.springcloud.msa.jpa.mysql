package com.iiit.train.springcloud.dao;

import com.iiit.train.springcloud.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by reng on 2017/7/12.
 */
public interface SysLogDAO extends JpaRepository<SysLog, Long> {
}
