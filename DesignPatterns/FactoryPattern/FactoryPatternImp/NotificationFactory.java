package DesignPatterns.FactoryPattern.FactoryPatternImp;

public class NotificationFactory {

    public static Notification sendingNotification(String type) {

        if (type.equals("EMAIL")) {
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SMSNotification();
        }

        throw new IllegalArgumentException("type is Not available");
    }

}

// now this notificatoinfactory class have the obj creation logic the two
// clients will just call this and use them instead having the logic creation
// with them.
// now client is not worried about how obj is created he just comes and use the
// required obj where the factory have obj creation logic is centralised for the
// client.
// this is called as the factory pattern.
