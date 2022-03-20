package com.example.springdemo;

import com.ruyuan.container.methodoverrides.BaseStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationOverridesContextDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseStudent student = (BaseStudent) context.getBean("baseStudent");
        student.sayHello();
    }
}
