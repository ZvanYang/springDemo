package com.ruyuan.container.methodoverrides;

/**
 * @author zvan
 */
public abstract class BaseStudent {

    public void sayHello() {
        getStudent().sayHello();
    }

    public abstract BaseStudent getStudent();

}
