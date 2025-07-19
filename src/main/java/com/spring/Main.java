package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

     ApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationByA.class);
     Doctor doctor = (Doctor) context.getBean("doctor");
     Nurse nurse = (Nurse) context.getBean("nurse");
     nurse.treat();
     doctor.treat();

    }
}