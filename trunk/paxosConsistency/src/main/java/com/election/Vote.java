/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.election;

/**
 * 类Vote.java的实现描述：TODO 类实现描述
 * 
 * @author dacy 2012-1-5 下午06:42:11
 */

public class Vote {

    // 每次选举通信的消息id，序列号
    public long id;

    // 最大的id TODO:具体的含义不确定
    public long zxid;

    public long epoch = -1;

    // public ServerState state = ServerState.LOOKING;

    public Vote(long id, long zxid){
        this.id = id;
        this.zxid = zxid;
    }

    public Vote(long id, long zxid, long epoch){
        this.id = id;
        this.zxid = zxid;
        this.epoch = epoch;
    }

//    public Vote(long id, long zxid, long epoch, ServerState state){
//        this.id = id;
//        this.zxid = zxid;
//        this.epoch = epoch;
//        this.state = state;
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vote)) {
            return false;
        }
        Vote other = (Vote) o;
        return (id == other.id && zxid == other.zxid && epoch == other.epoch);

    }

    @Override
    public int hashCode() {
        return (int) (id & zxid);
    }

    public String toString() {
        return "(" + id + ", " + Long.toHexString(zxid) + ")";
    }
}
