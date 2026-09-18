package SOLID_Principles.LiskovSubtitutionPrinciple;

public class CCPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("credit card pay done");
    }

    @Override
    public void refund() {
        System.out.println("credit card refund done");
    }

}
