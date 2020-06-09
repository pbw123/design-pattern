package com.company.bridgePattern;
/**/
public class MessageImplementorEmail implements MessageImplementor{
    @Override
    public void send() {
        System.out.println("邮箱发送方式--------");
    }
}
