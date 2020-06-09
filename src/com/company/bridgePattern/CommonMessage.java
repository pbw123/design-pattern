package com.company.bridgePattern;
/**
 * 普通消息类*/
public class CommonMessage extends Message{
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }



    @Override
    public void sendMessage() {
        System.out.println("这是--普通消息---");
        super.sendMessage();
    }
}
