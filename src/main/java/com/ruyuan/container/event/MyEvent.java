package com.ruyuan.container.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zvan
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }

    public void event() {
        System.out.println("自定义事件逻辑...");
    }
}
