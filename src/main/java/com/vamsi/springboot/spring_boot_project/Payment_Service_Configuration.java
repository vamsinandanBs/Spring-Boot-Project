package com.vamsi.springboot.spring_boot_project;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "payment-s")
@Component
public class Payment_Service_Configuration {
    private String URL;
    private String UserName;
    private String User_Key;

    public Payment_Service_Configuration() {

    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUser_Key() {
        return User_Key;
    }

    public void setUser_Key(String user_Key) {
        User_Key = user_Key;
    }
}
