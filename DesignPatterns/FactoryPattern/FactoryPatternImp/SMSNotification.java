package DesignPatterns.FactoryPattern.FactoryPatternImp;

public class SMSNotification implements Notification {

    public void send() {
        System.out.println("sending sms");
    }

}
