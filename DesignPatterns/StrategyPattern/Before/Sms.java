package DesignPatterns.StrategyPattern.Before;

public class Sms implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Sms");
    }

    @Override
    public void encrypt() {
        System.out.println("AES Encryption");
    }

    @Override
    public void compress() {
        System.out.println("GZip Compresssion");
    }
}