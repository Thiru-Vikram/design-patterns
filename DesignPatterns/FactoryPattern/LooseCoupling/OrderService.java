package DesignPatterns.FactoryPattern.LooseCoupling;

public class OrderService {

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

// this is how u achieved loose coupling where the client just dependent on only
// interface now u can add many as notification ways it is called only once it
// behaves as u called it can be sms or email in future u can add whatapp and it
// can be it.

// prob solved no why do we have obj creation in client class and also if u have
// mulitple senario like delivery service u can send the notification like
// delivered, outside the house same as
// this but u need to again write a separate class for it and write the same
// methods for it here we again have prob with code duplication. and also
// factory pattern says the obj creation should be in separate class not in the
// client class.
