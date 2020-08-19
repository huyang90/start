package com.hy.aop.controller;

/**
 * @outhor huyang
 * @create 2020/08/14 14:10
 */

import com.hy.aop.annotation.MyAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.DoubleStream;

@RestController
@RequestMapping("/aop")
public class AopController {

    @MyAnnotation
    @RequestMapping(value = "/Curry")
    public void Curry() {
        System.out.println("库里上场打球了！！");
    }

    @ResponseBody
    @RequestMapping(value = "/Harden")
    public DoubleStream Harden() {
        return DoubleStream.builder().build();
    }
}