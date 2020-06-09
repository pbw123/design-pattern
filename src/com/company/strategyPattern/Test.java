package com.company.strategyPattern;

public class Test {
    @org.junit.Test
    public void test() {

        FirstWeapon firstWeapon = new FirstWeapon();
        Context context = new Context(firstWeapon);
        context.switchWeapon();
        System.out.println("--------切换武器---------");
        SecondWeapon secondWeapon = new SecondWeapon();
        context.setWeapon(secondWeapon );
        context.switchWeapon();
    }
}
