package com.rent.cmcc.modules.bus.web;

import com.rent.cmcc.modules.bus.dao.TestDao;
import com.rent.cmcc.modules.bus.entity.Test;
import com.rent.cmcc.modules.bus.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "find")
    public String find(){
        Test test = testService.findByName("test");
        System.out.println(test.getName());
        System.out.println("shujianxiong");
        System.out.println("sourceTree");
        return "test";
    }
}
