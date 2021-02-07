package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private String title;
    private int runningTime;
    private int fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, int runningTime, int fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public int calculateMovieFee(Screening screening) {
        return fee - discountPolicy.calculateDiscountAmount(screening);
    }
}
