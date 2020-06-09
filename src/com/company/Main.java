package com.company;

import com.company.factory.CarFactory;
import com.company.interfa.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car car = CarFactory.myCarFactory("Cayenne");
        Car car = CarFactory.myCarFactory("Panamera");
        car.run();
        car.stop();
    }
}
