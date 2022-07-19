package org.example.radio;

import org.example.presenter.PresenterInt;
import org.example.presenter.Presenters;
import org.example.presenter.PresentersGuest;
import org.example.Utils;
import org.example.broadcast.BroadInt;
import org.example.broadcast.Broadcasts;
import org.example.events.*;

import java.util.ArrayList;
import java.util.List;

public class Radio {
    private String radioName;
    public Radio(String radioName){
        this.radioName = radioName;
        broadcast = new ArrayList<>();
        presenter = new ArrayList<>();
    }
    private List<BroadInt> broadcast;
    private List<PresenterInt> presenter;

    public int broadcastLength(){
        return this.broadcast.size();
    }

    // get all broadcast
    public void getBroad(){
        System.out.println();
        for(BroadInt broad: broadcast){
            System.out.println(broad.toString());
        }
        System.out.println();
    }

    //get all presenter
    public void getPresenters(){
        for(PresenterInt pres: presenter){
            if(pres.getClass() == Presenters.class){
                System.out.println(pres.toString());
            }
        }
    }

    //get all guest presenter
    public void getPresentersGuest(){
        for(PresenterInt pres: presenter){
            if(pres.getClass() == PresentersGuest.class){
                System.out.println(pres.toString());
            }
        }
    }

    // create default object
    public void setBoardEvent(){
        for(BroadInt broad: broadcast) {
            if (broad.getName().equals("first")) {
                broad.addSong("rock", "rock", 5);
                broad.addInterview("Jon", 5);
                broad.addAdvertising("car", 5);
                broad.addSong("bluz", "bluz", 4);
                broad.addSong("rock", "rock", 5);
                broad.addInterview("Jon", 5);
            }
            if (broad.getName().equals("second")) {
                broad.addSong("rock", "rock", 5);
                broad.addInterview("Jon", 5);
                broad.addAdvertising("car", 5);
                broad.addSong("bluz", "bluz", 4);
            }
        }
    }

    // get event for the broadcast
    public void getBroadEvent(String bname){
        for(BroadInt broad: broadcast){
            if (broad.getName().equals(bname)) {
                broad.getEvent();
            }
        }
        System.out.println();
    }

    // add event for the broadcast
    public void setBroadEvent(String bname, int type){
        for(BroadInt broad: broadcast){
            if (broad.getName().equals(bname)) {
                if (type == 1){
                    broad.addSong(Utils.getArtistName(),Utils.getSongName(),Utils.getDuration());
                }
                if (type == 2){
                    broad.addInterview(Utils.getInterviewName(),Utils.getDuration());
                }
                if (type == 3){
                    broad.addAdvertising(Utils.getAdvertisingName(),Utils.getDuration());
                }
            }
        }
    }

    // add new presenter
    public void setPresenter(PresenterInt present){
        presenter.add(present);
    }

    // add new guest presenter
    public void setPresentersGuest(PresenterInt present){
        presenter.add(present);
    }

    // add new broadcast
    public void setBroadcast(BroadInt broad) {
        broadcast.add(broad);
    }
    public void addBroadcast(String name, int duration) {
        broadcast.add(new Broadcasts(name, duration));
    }
}
