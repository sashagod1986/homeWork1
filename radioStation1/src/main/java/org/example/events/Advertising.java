package org.example.events;

public class Advertising implements Event {
    private String advertisingName;
    public final int COST = 300;
    private int duration;

    public Advertising(String advertisingName, int duration) {
        this.advertisingName = advertisingName;
        this.duration = duration;
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Advertising of " + advertisingName + " COST=" + COST + " duration=" + duration;
    }
    public int getCost() {
        return COST;
    }

    @Override
    public boolean type() {
        return true;
    }
}
