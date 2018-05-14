package com.rent.cmcc.modules.bus.service;

import com.rent.cmcc.modules.bus.dao.TestDao;
import com.rent.cmcc.modules.bus.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestDao {

    @Autowired
    TestDao testDao;
    @Override
   public Test findByName(String name){
        return testDao.findByName(name);
    }

}
