package SOLID_Principles.LiskovSubtitutionPrinciple;

public class Client {

    // this two methods are called overloading
    // this is called only for childs who have behaves as parent + extra features
    public void processPayment(Payment payment) {
        payment.pay();

        payment.refund();
    }

    // this is for which reduce one feature for parent class
    public void processPayment(NoRefundPayment payment) {
        payment.pay();
    }
}
