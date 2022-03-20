package com.ruyuan.container.methodoverrides;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author zvan
 */
public class StudentReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("方法替换了...");
        return null;
    }
}

