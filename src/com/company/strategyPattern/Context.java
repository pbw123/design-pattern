package com.company.strategyPattern;

public class Context {
    private Weapon weapon;

    public Context(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void switchWeapon() {
        System.out.print("正在使用的是-------");
        weapon.run();
    }
}
