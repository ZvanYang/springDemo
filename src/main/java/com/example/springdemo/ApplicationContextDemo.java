package com.example.springdemo;

import com.ruyuan.container.event.MyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.publishEvent(new MyEvent("MyEvent"));
    }
}
