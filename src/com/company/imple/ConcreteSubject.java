package com.company.imple;

import com.company.interfa.Observer;
import com.company.interfa.Subject;

import java.util.ArrayList;
import java.util.List;


public class ConcreteSubject implements Subject {
    /*存储订阅公众号的微信用户*/
    private List<Observer> userList = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer user:userList) {
            user.update(message);
        }
    }
}
