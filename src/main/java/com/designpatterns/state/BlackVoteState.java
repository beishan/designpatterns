package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public class BlackVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteMananger) {
        System.out.println("进入黑名单，你将不能登录和使用本系统");
    }
}
