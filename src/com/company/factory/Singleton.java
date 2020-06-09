package com.company.factory;
/**
 优点：既避免了同步带来的性能损耗，又能够延迟加载

 */
public class Singleton {
    private Singleton() {
    }
    private static class SingletonHolder{
        private static Singleton singleton = new Singleton();
    }

    public static  Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
