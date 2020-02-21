package com.tao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoutao
 * @description: TODO
 * @date 2020/2/20
 */
@RestController
@RequestMapping("/client")
public class ConfigClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    private String index() {
        return this.port;
    }
}
