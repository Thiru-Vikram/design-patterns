package DesignPatterns.FactoryPattern.LooseCoupling;

public class SMSNotification implements Notification {

    public void send() {
        System.out.println("sending sms");
    }

}
