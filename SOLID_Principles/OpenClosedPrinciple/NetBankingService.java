package SOLID_Principles.OpenClosedPrinciple;

public class NetBankingService implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Net banking payment");
    }
}
