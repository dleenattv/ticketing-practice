package me.study.ticketingsystem;

import org.springframework.stereotype.Component;

@Component
public class SequenceCondition implements DiscountCondition{

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getSequence() == sequence;
    }
}
