package com.company.builderModel;

import org.junit.Test;

public class ModelBuilder {

    public void createCar(CarColor color, Car car) {
        Model model = new Model();
        model.addItem(color);
        model.addItem(car);
        model.cost();
        model.printItem();
    }

    @Test
    public void Test() {
        BlackColor blackColor = new BlackColor();
        Cayenne cayenne = new Cayenne();
        Panamera panamera = new Panamera();
        RedColor redColor = new RedColor();
        this.createCar(blackColor,panamera);
    }
}
