package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Doctor doctor = (Doctor) context.getBean("doctor");
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.treat();
        doctor.treat();

    }
}