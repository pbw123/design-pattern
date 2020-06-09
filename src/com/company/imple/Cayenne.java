package com.company.imple;

import com.company.interfa.Car;

public class Cayenne implements Car {
    @Override
    public void run() {
        System.out.println("宝时捷卡宴驰骋在路上");
    }

    @Override
    public void stop() {
        System.out.println("宝时捷卡宴停下来了");
    }
}
