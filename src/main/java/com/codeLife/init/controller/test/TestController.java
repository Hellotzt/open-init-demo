package com.codeLife.init.controller.test;

import com.codeLife.init.common.param.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public ResultData<String> hello(){
        int i = 1 / 0;
        return ResultData.success("Hello,world!");
    }
}
