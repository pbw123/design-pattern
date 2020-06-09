package com.company.adapterPattern;

public class Adapter2 implements Socket{
    private Phone phone;

    public Adapter2(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void electric() {
        if (phone != null) {
            phone.call();
            System.out.println("同时也在充电~~~~~~");
        }
    }
}
