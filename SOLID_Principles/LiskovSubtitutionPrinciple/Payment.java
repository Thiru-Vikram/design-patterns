package SOLID_Principles.LiskovSubtitutionPrinciple;

public interface Payment extends NoRefundPayment {

    void refund();

}
