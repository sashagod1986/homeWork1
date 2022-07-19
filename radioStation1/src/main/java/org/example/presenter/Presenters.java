package org.example.presenter;

public class Presenters implements PresenterInt {
    private String name;
    private int workExperience;
    private String programsList;
    public Presenters(String name, int workExperience, String programsList){
        this.name = name;
        this.workExperience = workExperience;
        this.programsList = programsList;
    }

    @Override
    public String toString() {
        return "Presenters " + name + " workExperience= " + workExperience + " programsList " + programsList;
    }
}
