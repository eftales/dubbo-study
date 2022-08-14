package com.abc.dubbo;

import com.abc.dubbo.bean.UserAddress;
import com.abc.dubbo.service.RPCContext;
import com.alibaba.dubbo.remoting.RemotingException;
import com.alibaba.dubbo.rpc.RpcException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        ctx.start();
        RPCContext rpcContext = ctx.getBean(RPCContext.class);
        List<UserAddress> userAddresss = rpcContext.userService.getUserAddressList("1");
        userAddresss.forEach((o)->{
            System.out.println(o.toString());
        });

        try{
            UserAddress userAddress  = rpcContext.userService.echo(new UserAddress(-100,"address","userID","","",""));
            System.out.println(userAddress);
        }catch (RpcException e){
            System.out.println(e.getMessage());
        }

        try{
            UserAddress userAddress  = rpcContext.userService.echo(new UserAddress(100,"address","userID","","",""));
            System.out.println(userAddress);
        }catch (RpcException e){
            System.out.println(e.getMessage());
        }

    }
}
