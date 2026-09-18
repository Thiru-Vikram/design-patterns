package SOLID_Principles.OpenClosedPrinciple;

public class Main {

    public static void processPayment(PaymentService paymentService) {
        paymentService.pay();
    }

    public static void main(String[] args) {
        // Open Closed Principle:
        // - Open for extension
        // - Closed for modification

        // Existing code remains unchanged.
        // We can add more payment methods by creating new classes.
        processPayment(new UPIService());
        processPayment(new CreditCardService());
        processPayment(new NetBankingService());
    }
}
