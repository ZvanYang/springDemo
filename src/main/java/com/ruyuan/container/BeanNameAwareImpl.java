package com.ruyuan.container;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author zvan
 */
public class BeanNameAwareImpl implements BeanNameAware {
    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("BeanNameAwareImpl beanName:" + beanName);
    }
}
