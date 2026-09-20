package DesignPatterns.AdaptorPattern.UsingAdaptor;

public class Main {

    public static void main(String[] args) {

        new PaymentClient(new PaypalAdaptor(new PaypalGateway())).makePayment();

    }

}
