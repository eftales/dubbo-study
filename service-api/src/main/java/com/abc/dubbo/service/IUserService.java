package com.abc.dubbo.service;

import com.abc.dubbo.bean.UserAddress;

import java.util.List;

public interface IUserService {
    List<UserAddress> getUserAddressList(String userId);
}
