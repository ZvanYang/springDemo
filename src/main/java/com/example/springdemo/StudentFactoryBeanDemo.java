package com.example.springdemo;

import com.ruyuan.container.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zvan
 */
public class StudentFactoryBeanDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("studentFactoryBean");
        Object studentFactoryBean = context.getBean("&studentFactoryBean");
        System.out.println(student);
        System.out.println(studentFactoryBean);
    }
}
