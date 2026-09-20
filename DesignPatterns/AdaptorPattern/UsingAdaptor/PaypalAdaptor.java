package DesignPatterns.AdaptorPattern.UsingAdaptor;

public class PaypalAdaptor implements PaymentService {

    PaypalGateway paypalGateway;

    public PaypalAdaptor(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay(int amount, int customerId) {

        int res = paypalGateway.doTransaction(Double.valueOf(amount), customerId);
        if (res == 1) {
            return "SUCCESS";
        }
        return "FAILED";
    }

}

// new here paypal adaptoer is in the clients required format so we just use the
// paypal reference here now implement the logic here
