package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class Money {
    // primitive type 을 가질수없나?
    private int won;

    public Money(int won) {
        this.won = won;
    }

    public void wons(int won) {
        this.won = won;
        System.out.println(won);
    }
}
