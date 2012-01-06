/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.byread;


/**
 * 类Hello.java的实现描述：TODO 类实现描述 
 * @author dacy 2012-1-6 上午10:29:36
 */
public class Hello implements HelloMBean {

    private String name;

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Hello, " + name);
    }

    public void printHello(String theName) {
        System.out.println("Hello, " + theName);
    }

    public void setName(String name) {
        this.name = name;
    }

}
