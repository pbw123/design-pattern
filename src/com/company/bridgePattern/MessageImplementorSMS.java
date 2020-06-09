package com.company.bridgePattern;

public class MessageImplementorSMS implements MessageImplementor{
    @Override
    public void send() {
        System.out.println("手机发送的方式------");
    }
}
