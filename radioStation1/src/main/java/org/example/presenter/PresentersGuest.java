package org.example.presenter;

public class PresentersGuest implements PresenterInt {
    private String resume;
    public PresentersGuest(String resume){
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "PresentersGuest resume " + resume;
    }
}
