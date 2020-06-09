package com.company.AdapterPattern;

public class Test {
    @org.junit.Test
    public void test() {
        Adapter adapter = new Adapter();
        adapter.electric();
    }

    /*对象适配模式*/
    @org.junit.Test
    public void test2() {
        Phone phone = new Phone();
        Adapter2 adapter = new Adapter2(phone);
        adapter.electric();
    }
}
