package com.yi23.dubbo.inter.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import com.yi23.dubbo.bean.UserAddress;
import com.yi23.dubbo.inter.OrderUserAddressService;

import java.util.ArrayList;
import java.util.List;

//@Component
//@Service
public class OrderUserAddressServiceImpl implements OrderUserAddressService {

    public List<UserAddress> getListUserAddress(){
        List<UserAddress> list = new ArrayList<UserAddress>();
        list.add(new UserAddress(10,"order11","order",29,"10000"));
        list.add(new UserAddress(100,"order12","order2",29,"1002"));
        return list;
    }
}
