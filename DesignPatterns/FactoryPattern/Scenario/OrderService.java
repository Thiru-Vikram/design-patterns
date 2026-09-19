package DesignPatterns.FactoryPattern.Scenario;

public class OrderService {

    EmailNotification emailNotification = new EmailNotification();
    SMSNotification smsNotification = new SMSNotification();

    public void sendingEmail() {
        emailNotification.send();
    }

    public void sendingSMS() {
        smsNotification.send();
    }

}

// this is the design u created for scenario where u have businees food delivery
// u need to send
// notifications so have multiples that is here u send in email and also u can
// send in sms also so on if u need u can also add whataspp also

// so here file becomes huge eveytime u create a separate obj first and then
// separate method again so it becomes messy
// and also porblem in this design is tight coupling u have created multiple
// things in a same class so we need to fix it means by first need to achievce
// abstraction and try to achieve loose coupling
