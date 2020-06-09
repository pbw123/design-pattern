package com.company.adapterPattern;

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

    /*接口适配器的用意是当一个接口有很多方法时,
    又只需实现其中几个,便可用抽象类作为具体接口实现而不实现其方法
     */
    @org.junit.Test
    public void test3() {
        Adapter3Imp adapter3Imp = new Adapter3Imp();
        adapter3Imp.electric();
    }
}
