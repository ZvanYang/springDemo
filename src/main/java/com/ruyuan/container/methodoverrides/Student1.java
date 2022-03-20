package com.ruyuan.container.methodoverrides;


/**
 * @author zvan
 */
public class Student1 extends BaseStudent {

    @Override
    public void sayHello() {
        System.out.println("hello student1...");
    }

    @Override
    public BaseStudent getStudent() {
        return new Student1();
    }

}
