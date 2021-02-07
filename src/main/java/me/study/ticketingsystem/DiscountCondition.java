package me.study.ticketingsystem;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening);
}
