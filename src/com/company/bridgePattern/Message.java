package com.company.bridgePattern;
/**消息抽象类*/
public abstract class Message {
    private MessageImplementor messageImplementor;

    public Message(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    public void sendMessage() {
        messageImplementor.send();
    }
}
