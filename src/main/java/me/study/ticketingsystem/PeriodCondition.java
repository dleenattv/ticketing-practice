package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class PeriodCondition implements DiscountCondition {
    private String dayOfWeek;
    private int startTime;
    private int endTime;

    public PeriodCondition() {
    }

    public PeriodCondition(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public PeriodCondition(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public PeriodCondition(String dayOfWeek, int startTime, int endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        if (Integer.parseInt(screening.getWhenScreened()) >= startTime
                && Integer.parseInt(screening.getWhenScreened()) <= endTime) {
            return true;
        } else {
            return false;
        }
    }
}
