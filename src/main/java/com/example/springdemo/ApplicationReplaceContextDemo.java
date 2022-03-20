package com.example.springdemo;

import com.ruyuan.container.methodoverrides.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zvan
 */
public class ApplicationReplaceContextDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student2 student = (Student2) ctx.getBean("student2");
        student.sayHello();
    }
}
