package SOLID_Principles.LiskovSubtitutionPrinciple;

public class CryptoPayment implements NoRefundPayment {

    @Override
    public void pay() {
        System.out.println("crypto pay done");
    }

    // // here it is against the parent class
    // @Override
    // public void refund() {
    // throw new UnsupportedOperationException("refund is not allowed");
    // }

}
