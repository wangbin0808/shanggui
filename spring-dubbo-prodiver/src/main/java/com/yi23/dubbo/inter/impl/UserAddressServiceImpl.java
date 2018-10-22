package com.yi23.dubbo.inter.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yi23.dubbo.bean.UserAddress;
import com.yi23.dubbo.inter.UserAddressService;
import org.springframework.stereotype.Component;

//@Service
//@Component
public class UserAddressServiceImpl implements UserAddressService {

    public UserAddress getUserAddress(Integer var1){
        return new UserAddress(10,"wangbin","wangtainyan",29,"1");
    }

}
