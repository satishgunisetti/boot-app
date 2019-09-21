package com.dbs.bootapp.controller;


import com.dbs.bootapp.config.AppConfig;
import com.dbs.bootapp.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PageController {
    private TestService testService;

    public PageController(TestService service) {
        this.testService = service;
    }

    @GetMapping
    public String hello(){
        return String.format("<i>%s</i>", testService.getMessage());
    }
}
