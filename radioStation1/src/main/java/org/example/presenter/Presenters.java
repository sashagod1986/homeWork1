package org.example.presenter;

public class Presenters implements PresenterInt {
    private String name;
    private int workExperience;
    private String programsList;
    public Presenters(String name, int workExperience){
        this.name = name;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name " + name + " workExperience= " + workExperience;
    }
}
