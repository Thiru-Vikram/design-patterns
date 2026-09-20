package DesignPatterns.AdaptorPattern.UsingAdaptor;

public class RazorpayAdaptor implements PaymentService {

    RazorpayGateway razorpayGateway;

    public RazorpayAdaptor(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public String pay(int amount, int customerId) {

        boolean res = razorpayGateway.performTransaction(Double.valueOf(amount), Double.valueOf(customerId));

        if (res) {
            return "SUCCESS";
        }
        return "FAILED";
    }

}
