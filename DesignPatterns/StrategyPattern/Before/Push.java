package DesignPatterns.StrategyPattern.Before;

public class Push implements Notification {

    @Override
    public void send() {
        System.out.println("Sending push");
    }

    @Override
    public void encrypt() {
        System.out.println("RSA Encryption");
    }

    @Override
    public void compress() {
        System.out.println("ZIP Encryption");
    }

}
