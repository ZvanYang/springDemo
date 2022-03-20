package com.ruyuan.container.factorybean;

import com.ruyuan.container.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zvan
 */
public class StudentFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        System.out.println("通过FactoryBean创建Student，开始...");
        Student student = new Student();
        student.setAge(17);
        student.setName("小明");

        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
