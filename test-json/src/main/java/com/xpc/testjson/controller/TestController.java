package com.xpc.testjson.controller;

import com.xpc.testjson.vo.ManVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("test")
    public ManVO test() {
        ManVO manVO = new ManVO();
        manVO.setAge(18);
        manVO.setName("laohan");
        manVO.setSex("男");
        return manVO;
    }
}
