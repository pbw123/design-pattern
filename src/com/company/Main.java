package com.company;

import com.company.factory.CarFactory;
import com.company.factory.MyProxyFactory;
import com.company.imple.*;
import com.company.interfa.Car;
import com.company.interfa.IDog;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Car car = CarFactory.myCarFactory("Cayenne");
        Car car = CarFactory.myCarFactory("Panamera");
        car.run();
        car.stop();
    }

    @Test
    public void ProxyTest() {
        Boss boss = new Boss();
        ProxyBoss proxyBoss = new ProxyBoss(boss);
        proxyBoss.work();
    }

    @Test
    public void ProxyDemoTest() {
        IDog dog = new GunDog();
        IDog proxy = (IDog) MyProxyFactory.getProxy(dog);
        proxy.run();
    }

    @Test
    public void ObserverTest() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
//        微信用户
        WeChatUser joker = new WeChatUser("Joker");
        WeChatUser mary = new WeChatUser("Mary");
//        订阅了该公众号的微信用户
        concreteSubject.add(joker);
        concreteSubject.add(mary);

        String message = "明天放假";
        concreteSubject.notify(message);
        /*Joker收不到通知*/
        concreteSubject.remove(joker);
        concreteSubject.notify(message);

    }

}
