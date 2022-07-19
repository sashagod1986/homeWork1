package org.example.events;

public class Interview implements Event {
    private String giveInterview;

    private int duration;
    private final int COST = 30;
    public Interview(String giveInterview, int duration) {
        this.giveInterview = giveInterview;
        this.duration = duration;
    }

    public String getGiveInterview() {
        return giveInterview;
    }

    public void setGiveInterview(String giveInterview) {
        this.giveInterview = giveInterview;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Interview of " + giveInterview + " COST= " + COST + " duration=" + duration;

    }
    public int getCost() {
        return COST;
    }

    @Override
    public boolean type() {
        return true;
    }
}
