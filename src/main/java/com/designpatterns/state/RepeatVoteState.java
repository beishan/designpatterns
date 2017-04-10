package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public class RepeatVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteMananger) {
        System.out.println("请不要重复投票");
    }
}
