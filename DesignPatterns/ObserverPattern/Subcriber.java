package DesignPatterns.ObserverPattern;

public class Subcriber {

    private String name;
    private int id;

    public Subcriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void update(String videoTitle) {
        System.out.println("New Video out " + videoTitle);
    }

}

// this is called as observer