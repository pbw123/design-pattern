package com.company;

import com.company.factory.CarFactory;
import com.company.factory.MyProxyFactory;
import com.company.imple.Boss;
import com.company.imple.GunDog;
import com.company.imple.ProxyBoss;
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
    public void   ProxyDemoTest() {

            IDog dog = new GunDog();
            IDog proxy =(IDog) MyProxyFactory.getProxy(dog);
            proxy.run();

            }

}
