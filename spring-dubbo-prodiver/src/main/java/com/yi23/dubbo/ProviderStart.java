package com.yi23.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderStart {

    public static void main(String[] args) throws Exception {
        System.out.println("qidong---");

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("dubbo.xml");
        ioc.start();

        System.out.println("服务已经开启");

        System.in.read();
    }
}
