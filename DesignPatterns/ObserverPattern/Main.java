package DesignPatterns.ObserverPattern;

public class Main {

    public static void main(String[] args) {

        Subcriber subcriber1 = new Subcriber("hello", 1);
        Subcriber subcriber2 = new Subcriber("dfkdjf", 2);
        Subcriber subcriber3 = new Subcriber("ksdhfds", 3);
        Subcriber subcriber4 = new Subcriber("lskjkdf", 4);
        Subcriber subcriber5 = new Subcriber("lkdjkdf", 5);

        Channel channel = new Channel();
        channel.subcribe(subcriber1);
        channel.subcribe(subcriber2);
        channel.subcribe(subcriber3);
        channel.subcribe(subcriber4);
        channel.subcribe(subcriber5);

        channel.uplodedVideo("How to Build emergency Fund");

    }

}

// Observer Pattern:-
// → It is a design pattern where one object automatically notifies multiple
// other objects whenever any change or any event occurs.
