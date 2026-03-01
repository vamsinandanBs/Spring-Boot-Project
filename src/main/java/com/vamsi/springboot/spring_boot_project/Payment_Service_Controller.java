package com.vamsi.springboot.spring_boot_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Payment_Service_Controller {

    @Autowired
    private Payment_Service_Configuration configuration;

    @RequestMapping("/Payment_Service")
    public Payment_Service_Configuration Retrive_Status(){
        return (configuration);
    }
}
