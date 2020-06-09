package com.company.factory;
/**
 ①声明静态私有类变量，且立即实例化，保证实例化一次

②私有构造，防止外部实例化（通过反射是可以实例化的，不考虑此种情况）

③提供public的getInstance（）方法供外部获取单例实例

好处：线程安全；获取实例速度快 缺点：类加载即初始化实例，内存浪费
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public Singleton getInstance() {
        return instance;
    }
}
