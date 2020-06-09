package com.company.AdapterPattern;

public class Adapter3Imp extends Adapter3{
    @Override
    public void electric() {
        super.electric();
        System.out.println("接口适配器的用意是当一个接口有很多方法时," +
                "又只需实现其中几个,便可用抽象类作为具体接口实现而不实现其方法");
    }
}
