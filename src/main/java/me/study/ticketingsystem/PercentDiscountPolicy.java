package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class PercentDiscountPolicy implements DiscountPolicy{
    private int percentage;
    private PeriodCondition periodCondition;
    private SequenceCondition sequenceCondition;

    public PercentDiscountPolicy() {

    };

    public PercentDiscountPolicy(int percentage, PeriodCondition periodCondition) {
        this.percentage = percentage;
        this.periodCondition = periodCondition;
    }

    public PercentDiscountPolicy(int percentage, SequenceCondition sequenceCondition) {
        this.percentage = percentage;
        this.sequenceCondition = sequenceCondition;
    }

    @Override
    public int calculateDiscountAmount(Screening screening) {
        if (periodCondition != null) {
            //
        } else if (sequenceCondition != null) {
            //
        }
        return 0;
    }
}
