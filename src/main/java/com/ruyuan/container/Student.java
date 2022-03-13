package com.ruyuan.container;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Student";

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:" + name);
    }
}
