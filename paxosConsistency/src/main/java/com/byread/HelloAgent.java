/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.byread;

import java.rmi.registry.LocateRegistry;
import java.util.HashMap;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import javax.management.remote.JMXAuthenticator;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import javax.security.auth.Subject;

import com.sun.jdmk.comm.HtmlAdaptorServer;

/**
 * 类server.java的实现描述：TODO 类实现描述
 * 
 * @author dacy 2012-1-6 上午09:59:02
 */
public class HelloAgent {

    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(8844);
        MBeanServer server = MBeanServerFactory.createMBeanServer();
        ObjectName helloName = new ObjectName("hello:name=hello");
        server.registerMBean(new Hello(), helloName);

        HashMap<String, Object> prop = new HashMap<String, Object>();
        prop.put(JMXConnectorServer.AUTHENTICATOR, new JMXAuthenticator() {

            public Subject authenticate(Object credentials) {
                System.out.println(credentials);
                if (credentials instanceof String) {
                    if (credentials.equals("hello")) {
                        return new Subject();
                    }
                }
                throw new SecurityException("not authicated");
            }
        });

        JMXConnectorServer cserver = JMXConnectorServerFactory.newJMXConnectorServer(new JMXServiceURL(
                                                                                                       "service:jmx:rmi:///jndi/rmi://localhost:8844/hello"),
                                                                                     prop, server);

        cserver.start();

        ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer(8812);
        server.registerMBean(adapter, adapterName);

        adapter.start();
        System.out.println("start.....");

        System.out.println(server.getMBeanCount());
    }
}
