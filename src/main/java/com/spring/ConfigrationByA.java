package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.spring")
public class ConfigrationByA {

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }

}
