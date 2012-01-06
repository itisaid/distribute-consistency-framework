/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.byread;

import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.util.HashMap;

import javax.management.JMX;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import javax.management.remote.JMXAuthenticator;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import javax.security.auth.Subject;

/**
 * 类Test.java的实现描述：TODO 类实现描述
 * 
 * @author dacy 2012-1-6 上午09:45:38
 */
public class Test {




    public static void main(String[] args) {
        try {
            HashMap<String, Object> prop = new HashMap<String, Object>();
            prop.put(JMXConnector.CREDENTIALS, "hello");
            final JMXConnector conn = JMXConnectorFactory.connect(new JMXServiceURL(
                                                                                    "service:jmx:rmi:///jndi/rmi://localhost:8844/hello"),
                                                                  prop);

            HelloMBean hello = JMX.newMBeanProxy(conn.getMBeanServerConnection(), new ObjectName("hello:name=hello"),
                                                 HelloMBean.class);
            hello.setName("bearice");
            hello.printHello();
            hello.printHello("AAAAAA");
            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
