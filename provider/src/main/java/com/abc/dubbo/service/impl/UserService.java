package com.abc.dubbo.service.impl;

import com.abc.dubbo.bean.UserAddress;
import com.abc.dubbo.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 *
 * 1. 将服务提供者注册到注册中心
 *      1.1 导入dubbo依赖
 * 2. 服务消费者在注册中心订阅服务提供者的地址
 */



public class UserService implements IUserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1,"第一地址","1","齐天大圣","12345","NotDefault");
        UserAddress userAddress2 = new UserAddress(2,"第二地址","1","孙悟空","67890","Default");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
