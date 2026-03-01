package com.vamsi.springboot.spring_boot_project;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Check_Payment_status_Controller {

    @RequestMapping("/Payment_Status")
    public List<Payment_status> Retrive_Status(){
        return Arrays.asList(
                new Payment_status(123,"UPI","Success"),
                new Payment_status(132,"UPIQR","Success"),
                new Payment_status(132,"UPIQR","Failure"),
                new Payment_status(321,"UPI","Failure")
        );
    }
}
