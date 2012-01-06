/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.election;

/**
 * 类Election.java的实现描述：选举的接口 
 * @author dacy 2012-1-5 下午06:38:45
 */
public interface Election {
    
    //查询leader，即选举leader TODO 返回值
    public Vote lookForLeader() throws InterruptedException;
    
    //选举结束？？TODO 待确认
    public void shutdow();

}
