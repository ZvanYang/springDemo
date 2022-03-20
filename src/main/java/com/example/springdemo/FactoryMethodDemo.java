package com.example.springdemo;

import com.ruyuan.container.factorymethod.Student3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student3 student = (Student3) ctx.getBean("student3");
        System.out.println(student.getName());
    }
}
