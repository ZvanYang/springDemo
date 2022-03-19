package com.example.springdemo;

import com.ruyuan.container.MyClassPathXmlAApplicationContext;
import com.ruyuan.container.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zvan
 */
public class MyBeanFactoryProcessorDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());
    }
}
