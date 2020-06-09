package com.company.imple;

import com.company.interfa.Car;

public class Panamera implements Car {
    @Override
    public void run() {
        System.out.println("宝时捷帕拉梅拉驰骋在路上");

    }

    @Override
    public void stop() {
        System.out.println("宝时捷帕拉梅拉停下来了");
    }
}
