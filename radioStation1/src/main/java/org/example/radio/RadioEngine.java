package org.example.radio;

import org.example.presenter.PresenterInt;
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
        radio.addPresenter("Mike",10);
        radio.addPresenter("Jon",15);
        radio.addPresentersGuest("resume");
        radio.setBroadcast(new Broadcasts("first",60, Radio.getPresenter("Mike")));
        radio.setBroadcast(new Broadcasts("second",50, Radio.getPresenter("Jon")));
        radio.setBoardEvent();
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
            System.out.println("9 list presenter events");
            System.out.println("0 exit");
            int choiceInt = Utils.getMenuInt();
            if (choiceInt == 0) {
                    exit = false;
                }
            if (choiceInt == 1) {
                String nameB = Utils.getBroadcastsName();
                int durB = Utils.getDuration();
                System.out.println("1 add presenter to broadcast");
                System.out.println("2 add new guest presenter to broadcast");
                int choiceP = Utils.getMenuInt();
                if (choiceP == 1) {
                    boolean presentrExist = false;
                    String nameP = Utils.getPresenterName();
                    for (PresenterInt pres : Radio.getPresenters()) {
                        if (pres.getName().equals(nameP)) {
                            presentrExist = true;
                        }
                    }
                    if (presentrExist) {
                        radio.addBroadcast(nameB, durB, Radio.getPresenter(nameP));
                    }
                    if (!presentrExist) {
                        System.out.println("no presenter " + nameP);
                    }
                }
                if (choiceP == 2) {
                    radio.addBroadcast(nameB, durB, radio.addPresentersGuest(Utils.getResume()));
                }
                if (choiceP > 2) {
                    System.out.println("wrong menu number");
                }
                Utils.waitingEnter();
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
                    radio.addBroadEvent(bname,type);
                    if (type == 0) {exitEvent = false;}
                }
                Utils.waitingEnter();
            }
            if (choiceInt == 5) {
                radio.addPresenter(Utils.getPresenterName(),Utils.getWorkExperience());
                Utils.waitingEnter();
            }
            if (choiceInt == 6) {
                radio.addPresentersGuest(Utils.getResume());
                Utils.waitingEnter();
            }
            if (choiceInt == 7) {
                radio.listPresenters();
                Utils.waitingEnter();
            }
            if (choiceInt == 8) {
                radio.listPresentersGuest();
                Utils.waitingEnter();
            }
            if (choiceInt == 9) {
                radio.listPresenterEvents(Utils.getPresenterName());
                Utils.waitingEnter();
            }
        }
    }
}
