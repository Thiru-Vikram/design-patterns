package DesignPatterns.AdaptorPattern.BeforeAdapter;

public class PaymentService {

    PaypalGateway paypalGateway = new PaypalGateway();

    public String pay(int amount, int customerId) {

        int res = paypalGateway.doTransaction(Double.valueOf(amount), customerId);

        if (res == 1) {
            return "SUCCESS";
        }

        return "FAILED";

    }

}

// now here the payment service needs payment gateway there multiple right now
// we r using the paypal in future if we wanted to change to other like razor we
// need to create again the methods we need change the logic here so it is
// tightly coupled intead it should be like a plug n play so we use adapter
// cause all this code is already tested if u make change u need to test it
// again if change here u need change in client also so at last ur changing
// eveything and need to test full workflow