package com.ruyuan.container;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zvan
 */
public class MyClassPathXmlAApplicationContext extends ClassPathXmlApplicationContext {
    public MyClassPathXmlAApplicationContext(String location) {
        super(location);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("重写ApplicationContext的postProcessBeanFactory的方法");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("student");

        beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);

        //super.postProcessBeanFactory(beanFactory);
    }
}
