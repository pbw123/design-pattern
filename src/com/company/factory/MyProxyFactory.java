package com.company.factory;

import com.company.imple.MyInvocationHandle;

import java.lang.reflect.Proxy;

//生产代理对象的工厂
public class MyProxyFactory{
    public static Object getProxy(Object target) {
        MyInvocationHandle handle = new MyInvocationHandle();
        handle.setTarget(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handle);
        return proxy;
    }
}