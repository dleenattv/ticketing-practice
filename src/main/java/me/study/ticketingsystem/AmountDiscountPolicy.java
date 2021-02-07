package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class AmountDiscountPolicy implements DiscountPolicy{
    private Money money;
    private PeriodCondition periodCondition;
    private SequenceCondition sequenceCondition;

    public AmountDiscountPolicy(){

    };

    public AmountDiscountPolicy(Money money, PeriodCondition periodCondition) {
        this.money = money;
        this.periodCondition = periodCondition;
    }

    public AmountDiscountPolicy(Money money, SequenceCondition sequenceCondition) {
        this.money = money;
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
