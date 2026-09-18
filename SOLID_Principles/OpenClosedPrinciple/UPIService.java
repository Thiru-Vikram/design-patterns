package SOLID_Principles.OpenClosedPrinciple;

public class UPIService implements PaymentService {

    @Override
    public void pay() {
        System.out.println("UPI payment");
    }

}
