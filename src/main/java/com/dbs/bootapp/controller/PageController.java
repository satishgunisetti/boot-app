package com.dbs.bootapp.controller;


import com.dbs.bootapp.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PageController {
    private AppConfig appConfig;

    public PageController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping
    public String hello(){
        return String.format("<i>%s</i>", appConfig.toString());
    }
}
