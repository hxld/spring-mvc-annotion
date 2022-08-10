package com.atguigu.service;

import org.springframework.stereotype.Service;

/**
 * @author hxld
 * @create 2022-08-10 22:59
 */
@Service
public class HelloService {

    public String sayHello(String name){
        return "Hello " + name;
    }
}
