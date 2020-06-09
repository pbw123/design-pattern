package com.company.bridgePattern;

public class UrgencyMessage extends Message{
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage() {
        System.out.println("这是--加急消息-------");
        super.sendMessage();
    }
}
