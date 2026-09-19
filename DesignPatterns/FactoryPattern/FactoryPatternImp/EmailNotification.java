package DesignPatterns.FactoryPattern.FactoryPatternImp;

public class EmailNotification implements Notification {

    public void send() {
        System.out.println("sending email");
    }

}
