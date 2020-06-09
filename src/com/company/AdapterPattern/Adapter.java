package com.company.AdapterPattern;
/**
 * 适配器：充电器*/
public class Adapter extends Phone implements Socket{

    @Override
    public void electric() {
        call();
        System.out.println("同时也在充电");
    }
}
