package com.company.bridgePattern;

public class Test {
    @org.junit.Test
    public void test() {
//        手机发送方式
        MessageImplementor sms = new MessageImplementorSMS();
//        普通消息用手机发送的方式
        Message message = new CommonMessage(sms);
        message.sendMessage();

//        邮箱发送紧急消息
        sms = new MessageImplementorEmail();
        message = new UrgencyMessage(sms);
        message.sendMessage();
    }
}
