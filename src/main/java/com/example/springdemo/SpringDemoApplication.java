package com.example.springdemo;

import com.ruyuan.container.BeanNameAwareImpl;
import com.ruyuan.container.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@SuppressWarnings("all")
public class SpringDemoApplication {

    public static void main(String[] args) {
        //XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //Student student = (Student) beanFactory.getBean("student");
        ////BeanNameAwareImpl beanNameAwareImpl = (BeanNameAwareImpl) beanFactory.getBean("beanNameAwareImpl");
        ////SpringApplication.run(SpringDemoApplication.class, args);
        //System.out.println(student);
        ////System.out.println(beanNameAwareImpl.getBeanName());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }

}
