package com.nickbi.webfluxdemo.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nickbi
 * @date 2018-08-28
 */
@RestController
@RequestMapping(value = "/mvc")
public class MvcController {

    /**
     * hello接口
     *
     * @return 返回字符串
     */
    @RequestMapping(value = "hello")
    public String hello() {
        return "hello Spring mvc!";
    }
}
