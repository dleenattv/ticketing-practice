package me.study.ticketingsystem;

public interface DiscountPolicy {
    public int calculateDiscountAmount(Screening screening);
}
