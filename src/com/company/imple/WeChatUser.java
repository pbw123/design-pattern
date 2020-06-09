package com.company.imple;

import com.company.interfa.Observer;
/**
 * 具体订阅者*/
public class WeChatUser implements Observer {
    private String name;

    public WeChatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("通知"+name+":"+message);
    }
}
