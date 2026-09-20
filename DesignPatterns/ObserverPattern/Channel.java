package DesignPatterns.ObserverPattern;

import java.util.*;

public class Channel {

    String videoTitle;

    // has to be 1 to many relationship
    List<Subcriber> subcribers = new ArrayList<>();

    public void subcribe(Subcriber s) {
        subcribers.add(s);
    }

    // loop through and notify all the subscribers
    public void notifySubcriber() {
        for (Subcriber s : subcribers) {
            s.update(videoTitle);
        }
    }

    public void uplodedVideo(String videoTitle) {
        this.videoTitle = videoTitle;
        System.out.println("New Video Uploded:- " + videoTitle);
        notifySubcriber();
    }

}

// there should be a main subject and the observer and there is an event or
// changes occur to the subject it should notify its all observers
// here we took yt channel as example.
// this is called as the subject