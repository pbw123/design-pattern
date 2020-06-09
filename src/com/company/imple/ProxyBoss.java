package com.company.imple;

import com.company.interfa.Company;

public class ProxyBoss implements Company {
    private Boss boss;

    public ProxyBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void work() {
        before();
        boss.work();
        after();
    }

    private void before() {
        System.out.println("准备会议");
    }

    private void after() {
        System.out.println("收尾工作");
    }
}
