package com.rent.cmcc.modules.bus;

import com.rent.cmcc.modules.bus.dao.TestDao;
import com.rent.cmcc.modules.bus.entity.Test;
import com.rent.cmcc.modules.bus.service.TestService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
public class MybatisTestTest {
    @Autowired
    TestDao testDao;
    @org.junit.Test
    public void test(){
        Test test = testDao.findByName("test");
        Assert.assertEquals(null,test);
    }

}