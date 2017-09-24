package com.chen.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyong on 2017-07-15.
 */

@RestController
@EnableAutoConfiguration
public class ExampleController {

    @RequestMapping("/hello")
    public String home(){
        System.out.println("dsds");
        return "hello world";
    }

    @RequestMapping("/index/{path}")
    public String pathVariable(@PathVariable String path){

        return path;
    }
}
