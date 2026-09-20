package DesignPatterns.AdaptorPattern.BeforeAdapter;

public class PaymentClient {

    PaymentService paymentService = new PaymentService();

    public void makePayment() {
        String result = paymentService.pay(100, 1);

        if (result == "SUCCESS") {
            System.out.println("Payment is done successfully");
        } else {
            System.out.println("Payment failed");
        }
    }

}

// here in this design we have the client who needs to use the payment service
// and make the payment.
// for the payment serivce we need any payment gateway for the transaction so
// payment service works that is used by client for the payment
