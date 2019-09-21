package com.dbs.bootapp.service;

import com.dbs.bootapp.config.AppConfig;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private AppConfig appConfig;

    public TestService(AppConfig appConfig) {
        this.appConfig = appConfig;
    }


    public String getMessage(){
        return String.format("<i>%s</i>", appConfig.toString());
    }
}
