/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.byread;

import java.io.Serializable;

/**
 * 类a.java的实现描述：TODO 类实现描述 
 * @author dacy 2012-1-6 上午10:43:41
 */
public interface HelloMBean extends Serializable {

    public String getName();

    public void setName(String name);

    public void printHello();

    public void printHello(String theName);

}
