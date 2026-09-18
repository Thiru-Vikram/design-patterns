package SOLID_Principles.LiskovSubtitutionPrinciple;

public class Main {

    public static void main(String[] args) {

        // Liskov Substitution Principle

        // --> If a child class extends a parent class, then we should be able to
        // replace the parent object with the child object without breaking the
        // application behavior.

        // --> a child class can add extra feature like upi its ok but a child class
        // cannot reduce the feature of the parent class like crypto its againt the
        // liskov rule

        // to solve this prob we create another interface with only pay and extend it.
        // we divide the interface we solve the liskovsubstitution pinciple

        Client c = new Client();

        c.processPayment(new CCPayment());
        c.processPayment(new UPIPayment());

        NoRefundPayment obj = new CryptoPayment();
        c.processPayment(obj);

    }
}