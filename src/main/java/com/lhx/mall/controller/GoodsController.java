package com.lhx.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
