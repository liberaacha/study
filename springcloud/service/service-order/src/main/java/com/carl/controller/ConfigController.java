package com.carl.controller;

import com.carl.model.OrderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    @Autowired
    private OrderConfig orderConfig;

    @GetMapping("user")
    public String getConfigValue() {
        return orderConfig.getAccount();
    }
}
