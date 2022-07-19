package org.example.events;

public class Song implements Event {
    private String artistName;
    private String songName;
    private int duration;

    public Song(String artistName, String songName, int duration) {
        this.artistName = artistName;
        this.songName = songName;
        this.duration = duration;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song " + songName + " artistName " + artistName + " duration= " + duration;
    }
    public int getCost(){
        return 0;
    }

    @Override
    public boolean type() {
        return false;
    }
}
