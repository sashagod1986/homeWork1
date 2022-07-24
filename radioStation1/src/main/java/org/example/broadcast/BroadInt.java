package org.example.broadcast;

import org.example.events.Event;
import org.example.presenter.PresenterInt;

// link for broadcast classes
public interface BroadInt {
    public String getName();
    public void listEvent();
    public void addSong(String artistName, String songName, int duration);
    public void addInterview(String giveInterview, int duration);
    public void addAdvertising(String advertisingName, int duration);
    public String getPresenterName();
}
