/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.election;

import org.apache.log4j.Logger;

/**
 * 类LeaderElection.java的实现描述：leader 选举的实现类 
 * @author dacy 2012-1-4 上午11:31:10
 */
public class LeaderElection implements Election{
    
    private static final Logger log = Logger.getLogger(LeaderElection.class);

    /* (non-Javadoc)
     * @see com.election.Election#shutdow()
     */
    public void shutdow() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.election.Election#lookForLeader()
     */
    public Vote lookForLeader() throws InterruptedException {

        // 通过jmx进行消息广播通信
        
        
        return null;
        
    }
    
    
    public static class ElectionResult {
        public Vote vote;

        public int count;

        public Vote winner;

        public int winningCount;
    }
    

}
