package org.example;

import java.util.Scanner;



public class Utils {

    public static int getMenuInt () {
        Boolean correct = true;
        int choiceInt = 0;
        while (correct) {
            System.out.println("enter your choice");
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            if(st.length() == 1){
                if (Character.isDigit(st.charAt(0))) {
                    choiceInt = Character.getNumericValue(st.charAt(0));
                    correct = false;
                    } else {
                        System.out.println("please enter correct value");
                    }
                } else {
                    System.out.println("please enter correct value");
                }
        }
        return choiceInt;
    }

    public static String getName(){
        Boolean correct = true;
        String name = "";
        while (correct) {
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            if (st.length() > 0){
                name = st;
                correct = false;
                } else {
                    System.out.println("please enter correct value");
                }
        }
        return name;
    }
    public static String getBroadcastsName(){
        System.out.println("enter new broadcasts name");
        return getName();
    }
    public static String getSongName(){
        System.out.println("enter new Song name");
        return getName();
    }

    public static String getArtistName(){
        System.out.println("enter new Artist name");
        return getName();
    }

    public static String getInterviewName(){
        System.out.println("enter who is give the interview");
        return getName();
    }
    public static String getAdvertisingName(){
        System.out.println("enter what is Advertised");
        return getName();
    }

    public static String getPresenterName(){
        System.out.println("enter presenter name");
        return getName();
    }
    public static String getProgramsList(){
        System.out.println("enter programs list");
        return getName();
    }

    public static String getResume(){
        System.out.println("enter resume");
        return getName();
    }


    public static int getWorkExperience(){
        System.out.println("enter work experience");
        Boolean correct = true;
        int choiceInt = 0;
        while (correct) {
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            if(st.length() < 3){
                boolean isdigit = true;
                for (int i=0;i<st.length()-1;i++){
                    if (!Character.isDigit(st.charAt(i))) {
                        isdigit = false;
                    }
                }
                if (isdigit) {
                    if (Integer.parseUnsignedInt(st)< 100 && Integer.parseUnsignedInt(st) > 0){
                        choiceInt = Integer.parseUnsignedInt(st);
                        correct = false;
                    } else  {System.out.println("work experience too large or small");}
                } else {System.out.println("please enter correct value");}
            } else {System.out.println("please enter correct value");}
        }
        return choiceInt;
    }

    public static void waitingEnter(){
        System.out.println("press enter to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }


    public static int getDuration(){
        Boolean correct = true;
        int choiceInt = 0;
        while (correct) {
            System.out.println("enter duration");
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            if(st.length() < 4){
                boolean isdigit = true;
                for (int i=0;i<st.length()-1;i++){
                    if (!Character.isDigit(st.charAt(i))) {
                        isdigit = false;
                    }
                }
                if (isdigit) {
                    if (Integer.parseUnsignedInt(st)< 721 && Integer.parseUnsignedInt(st) > 0){
                        choiceInt = Integer.parseUnsignedInt(st);
                        correct = false;
                    } else  {System.out.println("duration too large or small");}
                } else {System.out.println("please enter correct value");}
            } else {System.out.println("please enter correct value");}
        }
        return choiceInt;

    }
}
