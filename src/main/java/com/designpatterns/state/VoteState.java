package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public interface VoteState {

    void vote(String user, String voteItem, VoteManager voteMananger);
}
