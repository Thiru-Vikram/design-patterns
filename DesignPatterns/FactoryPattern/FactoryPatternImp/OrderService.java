package DesignPatterns.FactoryPattern.FactoryPatternImp;

public class OrderService {

    // lets say u wanted to use email notification
    public void sendNotification() {
        Notification notification = NotificationFactory.sendingNotification("EMAIL");
        notification.send();
    }

}

// now if u see the order serive client have just used the notification facoty
// staright and called the notification.
// like wise the delivery service can also use it.
