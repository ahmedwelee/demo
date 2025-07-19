package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    @Bean
    public void treat() {
        System.out.println("I am a doctor");
    }
}
