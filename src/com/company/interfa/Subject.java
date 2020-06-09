package com.company.interfa;

public interface Subject {
    /*添加订阅者*/
    void add(Observer observer);

    /*删除订阅者*/
    void remove(Observer observer);

    /*通知订阅者更新消息*/
    void notify(String message);
}
