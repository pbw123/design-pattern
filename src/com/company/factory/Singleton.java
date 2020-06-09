package com.company.factory;
/**
 天然线程安全，可防止反射生成实例。

 */
public enum Singleton {

    INSTANCE;

    public void init() {

        System.out.println("资源初始化。。。");

    }

}
