package com.yi23.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yi23.dubbo.bean.UserAddress;
import com.yi23.dubbo.inter.OrderUserAddressService;
import com.yi23.dubbo.inter.UserAddressService;

import java.util.List;

public class ConsumerApp {

    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("dubbo.xml");
        OrderUserAddressService orderUserAddressService
                =(OrderUserAddressService)ioc.getBean("orderUserAddressService");
        UserAddressService userAddressService = (UserAddressService)ioc.getBean("userAddressService");

        List<UserAddress> listUserAddress = orderUserAddressService.getListUserAddress();

        UserAddress userAddress = userAddressService.getUserAddress(10);

        System.out.println(userAddress);

        for (UserAddress user: listUserAddress) {
            System.out.println(user+"-----");
        }
        System.out.println("消费者---");
        System.in.read();
    }
}
