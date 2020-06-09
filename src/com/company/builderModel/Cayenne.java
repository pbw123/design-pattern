package com.company.builderModel;

public  class Cayenne extends Car{


    @Override
    public String name() {
        return "卡宴";
    }

    @Override
    public float price() {
        return 21.1f;
    }
}
