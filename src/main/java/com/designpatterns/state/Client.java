package com.designpatterns.state;

/**
 * Created by xueshan.wei on 4/10/2017.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("user1", "A");
        }
    }
}
