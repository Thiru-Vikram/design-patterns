package SOLID_Principles.LiskovSubtitutionPrinciple;

public class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("upi pay done");
    }

    @Override
    public void refund() {
        System.out.println("upi refund done");
    }

    public void balance() {
        System.out.println("check the balance");
    }
}
