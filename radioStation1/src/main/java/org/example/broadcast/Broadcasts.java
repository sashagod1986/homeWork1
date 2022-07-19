package org.example.broadcast;

import org.example.events.Advertising;
import org.example.events.Event;
import org.example.events.Interview;
import org.example.events.Song;

import java.util.ArrayList;
import java.util.List;

public class Broadcasts implements BroadInt {
    private int duration;
    private int durationTemp;
    private double costDuration;
    private double costDurationTemp;
    private String name;
    private List<Event> events;


//    private double profit;

    public Broadcasts(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.costDuration = duration/2;
        events = new ArrayList<>();
    }

    // add new event to broadcast
    public void addSong(String artistName, String songName, int eventDuration){
        if (duration >= durationTemp+costDurationTemp+eventDuration){
            durationTemp += costDurationTemp+eventDuration;
            events.add(new Song(artistName, songName, eventDuration));
        } else {System.out.println("time end");}
    }
    public void addInterview(String giveInterview, int eventDuration){
        if (costDuration >= costDurationTemp+eventDuration){
            costDurationTemp += eventDuration;
            events.add(new Interview(giveInterview, eventDuration));
        } else {System.out.println("cost time end");}
    }
    public void addAdvertising(String advertisingName, int eventDuration){
        if (costDuration >= costDurationTemp+eventDuration){
            costDurationTemp += eventDuration;
            events.add(new Advertising(advertisingName, eventDuration));
        } else {System.out.println("cost time end");}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {

        return "Broadcasts " + name +
                " duration= " + duration +
                " profit = " + getProfit();
    }

    // get all broadcast event
    public void getEvent(){
//        System.out.println(this.getName());
        for(Event event: events){
            System.out.println(event.toString());
        }
    }

    // get broadcast profit
    public double getProfit(){
        double profit = 0;
        for(Event event: events){
            profit += event.getCost()*event.getDuration();
        }
        return profit;
    }

}
