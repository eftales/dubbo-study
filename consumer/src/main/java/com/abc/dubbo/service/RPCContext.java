package com.abc.dubbo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RPCContext {
    @Autowired
    public IUserService userService;
}
