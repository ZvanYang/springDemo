package com.ruyuan.container.factorymethod;

/**
 * @author zvan
 */
public class StudentFactory {
    public static Student3 getStudentObject() {
        return new Student3();
    }
}
