package com.company.factory;
/**
 优点：在获取实例的方法中，进行实例的初始化，节省系统资源

 缺点：①如果获取实例时，初始化工作较多，加载速度会变慢，影响系统系能

 ②每次获取实例都要进行非空检查，系统开销大

 ③非线程安全，当多个线程同时访问getInstance()时，可能会产生多个实例
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
