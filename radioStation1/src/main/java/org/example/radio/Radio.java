package org.example.radio;

import org.example.presenter.PresenterInt;
import org.example.presenter.Presenters;
import org.example.presenter.PresentersGuest;
import org.example.Utils;
import org.example.broadcast.BroadInt;
import org.example.broadcast.Broadcasts;

import java.util.ArrayList;
import java.util.List;

public class Radio {
    private String radioName;
    public Radio(String radioName){
        this.radioName = radioName;
        broadcast = new ArrayList<>();
        presenters = new ArrayList<>();
        presenter = null;
    }
    private List<BroadInt> broadcast;
    private static List<PresenterInt> presenters;
    private static PresenterInt presenter;

    public int broadcastLength(){
        return this.broadcast.size();
    }

    public static List<PresenterInt> getPresenters() {
        return presenters;
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
    public void listPresenters(){
        for(PresenterInt pres: presenters){
            if(pres.getClass() == Presenters.class){
                System.out.println(pres);
            }
        }
    }
    //get all guest presenter
    public void listPresentersGuest(){
        for(PresenterInt pres: presenters){
            if(pres.getClass() == PresentersGuest.class){
                System.out.println(pres);
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
                broad.listEvent();
            }
        }
        System.out.println();
    }

    // add event for the broadcast
    public void addBroadEvent(String bname, int type){
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
    public void addPresenter(String name, int experience){
        presenters.add(new Presenters(name,experience));
    }

    public static PresenterInt getPresenter(String nameP) {
            for (PresenterInt pres : presenters) {
                if (pres.getName().equals(nameP)) {
                    presenter = pres;
                }
            }
        return presenter;
    }

    // add new guest presenter
    public PresenterInt addPresentersGuest(String resume){
        presenter = new PresentersGuest(resume);
        presenters.add(presenter);
        return presenter;
    }

    // add new broadcast
    public void setBroadcast(BroadInt broad) {
        broadcast.add(broad);
    }
    public void addBroadcast(String name, int duration, PresenterInt present) {
            broadcast.add(new Broadcasts(name, duration, present));
    }

    public void listPresenterEvents(String name) {
        boolean presentrExist = false;
        for (PresenterInt pres: presenters) {
                if (pres.getName().equals(name)) {presentrExist = true; }
                    if (presentrExist) {
                    for (BroadInt broad : broadcast) {
                        if (pres.getName().equals(broad.getPresenterName())) {
                            broad.listEvent();
                        }
                    }
                }
        }
        if (!presentrExist) {
            System.out.println("no presenter "+ name);
        }
    }
}
