package com.example.springdemo;

import com.ruyuan.container.MyClassPathXmlAApplicationContext;
import com.ruyuan.container.Student;
import org.springframework.context.ApplicationContext;

public class MyClassPathXmlAApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext context = new MyClassPathXmlAApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());

    }
}
