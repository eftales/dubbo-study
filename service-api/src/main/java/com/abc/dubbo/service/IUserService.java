package com.abc.dubbo.service;

import com.abc.dubbo.bean.UserAddress;
import org.springframework.validation.annotation.Validated;


import java.util.List;

public interface IUserService {
    List<UserAddress> getUserAddressList(String userId);
    UserAddress echo(@Validated UserAddress userAddress);
}
