package com.company.imple;

import com.company.interfa.IDog;

public class GunDog implements IDog {

    @Override
    public void run() {
        System.out.println("猎狗在跑");
    }
}