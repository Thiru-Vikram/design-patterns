package DesignPatterns.FactoryPattern.FactoryPatternImp;

public class DeliveryService {

    // u wanted to use sms notification
    public void sendNotification() {
        Notification notification = NotificationFactory.sendingNotification("SMS");
        notification.send();
    }

}
