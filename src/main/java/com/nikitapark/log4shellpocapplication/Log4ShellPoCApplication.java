package com.nikitapark.log4shellpocapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4ShellPoCApplication {

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        SpringApplication.run(Log4ShellPoCApplication.class, args);
    }

}
