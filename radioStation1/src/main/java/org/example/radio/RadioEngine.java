package org.example.radio;

import org.example.presenter.Presenters;
import org.example.presenter.PresentersGuest;
import org.example.Utils;
import org.example.broadcast.Broadcasts;

public class RadioEngine {
    private static boolean exit;

    // main method
    public static void radioEngine() {

        // create default object
        Radio radio = new Radio("radio");
        radio.setBroadcast(new Broadcasts("first",60));
        radio.setBroadcast(new Broadcasts("second",50));
        radio.setBoardEvent();
        radio.setPresenter(new Presenters("Mike",10,"intervies"));
        radio.setPresentersGuest(new PresentersGuest("resume"));

        // run menu
        exit = true;
        while (exit) {
            System.out.println("1 add new broadcasts");
            System.out.println("2 list broadcasts");
            System.out.println("3 list broadcasts event");
            System.out.println("4 add broadcasts event");
            System.out.println("5 add presenter");
            System.out.println("6 add guest presenter");
            System.out.println("7 list presenter");
            System.out.println("8 list guest presenter");
            System.out.println("0 exit");
            int choiceInt = Utils.getMenuInt();
            if (choiceInt == 0) {
                    exit = false;
                }
            if (choiceInt == 1) {

                radio.addBroadcast(Utils.getBroadcastsName(), Utils.getDuration());
                System.out.println();
                }
            if (choiceInt == 2) {
                radio.getBroad();
                Utils.waitingEnter();
            }
            if (choiceInt == 3) {
                System.out.println("enter broadcasts name");
                String bname = Utils.getName();
                radio.getBroadEvent(bname);
                Utils.waitingEnter();
            }
            if (choiceInt == 4) {
                System.out.println("enter broadcasts name");
                String bname = Utils.getName();
                boolean exitEvent = true;
                while (exitEvent) {
                    System.out.println("1 add new song");
                    System.out.println("2 add new interview");
                    System.out.println("3 add new advertising");
                    System.out.println("0 exit add broadcasts event");
                    int type = Utils.getMenuInt();
                    radio.setBroadEvent(bname,type);
                    if (type == 0) {exitEvent = false;}
                }
            }
            if (choiceInt == 5) {
                radio.setPresenter(new Presenters(Utils.getPresenterName(),Utils.getWorkExperience(),Utils.getProgramsList()));
            }
            if (choiceInt == 6) {
                radio.setPresentersGuest(new PresentersGuest(Utils.getResume()));
            }
            if (choiceInt == 7) {
                radio.getPresenters();
            }
            if (choiceInt == 8) {
                radio.getPresentersGuest();
            }
            if (choiceInt > 8){System.out.println("no menu number");}
        }
    }
}
