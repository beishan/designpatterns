package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteMananger) {
        voteMananger.getMapVate().put(user, voteItem);
        System.out.println("恭喜投票成功！");
    }
}
