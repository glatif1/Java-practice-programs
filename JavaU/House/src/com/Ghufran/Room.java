package com.Ghufran;


public class Room {
    private couch couch;
    private bed beds;
    private windows windows;

    public Room(couch couch, bed beds, windows windows) {
        this.couch = couch;
        this.beds = beds;
        this.windows = windows;
    }

    public com.Ghufran.couch getCouch() {
        return couch;
    }

    public bed getBeds() {
        return beds;
    }

    public windows getWindows() {
        return windows;
    }
}
