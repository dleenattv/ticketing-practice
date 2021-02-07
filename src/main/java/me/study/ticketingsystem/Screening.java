package me.study.ticketingsystem;

public class Screening {
    private Movie movie;
    private int sequence;
    private String whenScreened;    // 자료형 Date? Calendar?

    public Screening(Movie movie, int sequence, String whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public int getSequence() {
        return sequence;
    }

    public String getWhenScreened() {
        return whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return null;
    }
}
