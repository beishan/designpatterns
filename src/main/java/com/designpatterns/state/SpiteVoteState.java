package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteMananger) {
        String str = voteMananger.getMapVate().get(user);
        if(str != null){
            voteMananger.getMapVate().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格");
    }
}
