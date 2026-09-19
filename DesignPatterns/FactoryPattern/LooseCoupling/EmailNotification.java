package DesignPatterns.FactoryPattern.LooseCoupling;

public class EmailNotification implements Notification {

    public void send() {
        System.out.println("sending email");
    }

}
