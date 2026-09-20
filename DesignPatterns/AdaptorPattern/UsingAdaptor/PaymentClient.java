package DesignPatterns.AdaptorPattern.UsingAdaptor;

public class PaymentClient {

    PaymentService payment;

    public PaymentClient(PaymentService payment) {
        this.payment = payment;
    }

    public void makePayment() {
        String result = payment.pay(100, 1);

        if (result == "SUCCESS") {
            System.out.println("Payment is done successfully");
        } else {
            System.out.println("Payment failed");
        }
    }

}
