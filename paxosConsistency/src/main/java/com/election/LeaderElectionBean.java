/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.election;

import java.util.Date;

/**
 * 类LeaderElectionBean.java的实现描述：TODO 类实现描述
 * 
 * @author dacy 2012-1-6 上午09:38:01
 */
public class LeaderElectionBean {

    private final Date startTime = new Date();

    public String getName() {
        return "LeaderElection";
    }

    public boolean isHidden() {
        return false;
    }

    public String getStartTime() {
        return startTime.toString();
    }

}
