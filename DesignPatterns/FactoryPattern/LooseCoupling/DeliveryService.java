package DesignPatterns.FactoryPattern.LooseCoupling;

public class DeliveryService {

    Notification notification;

    public void sendingNotification(String type) {

        if (type.equals("EMAIL")) {
            notification = new EmailNotification();
        } else if (type.equals("SMS")) {
            notification = new SMSNotification();
        }

        notification.send();
    }

}
