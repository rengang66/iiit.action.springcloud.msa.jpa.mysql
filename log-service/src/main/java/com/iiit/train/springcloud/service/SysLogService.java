package com.iiit.train.springcloud.service;

import com.iiit.train.springcloud.dao.SysLogDAO;
import com.iiit.train.springcloud.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by reng on 2017/7/12.
 */
@Service
public class SysLogService {

    @Autowired
    SysLogDAO sysLogDAO;

    public void saveLogger(SysLog sysLog){
        sysLogDAO.save(sysLog);
    }
}
