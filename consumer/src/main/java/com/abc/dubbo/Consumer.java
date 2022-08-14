package com.abc.dubbo;

import com.abc.dubbo.bean.UserAddress;
import com.abc.dubbo.service.RPCContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        ctx.start();
        RPCContext rpcContext = ctx.getBean(RPCContext.class);
        List<UserAddress> userAddresss = rpcContext.userService.getUserAddressList("1");
        userAddresss.forEach((o)->{
            System.out.println(o.toString());
        });
    }
}
