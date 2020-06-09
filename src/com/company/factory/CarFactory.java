package com.company.factory;

import com.company.imple.Cayenne;
import com.company.imple.Panamera;
import com.company.interfa.Car;

public class CarFactory {

    public static Car myCarFactory(String type) {
        Car car;
        switch (type) {
            case "Cayenne":
                car= new Cayenne();
                break;
            case "Panamera":
                car= new Panamera();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return car;
    }
}
