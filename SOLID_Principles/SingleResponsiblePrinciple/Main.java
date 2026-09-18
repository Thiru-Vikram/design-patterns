package SOLID_Principles.SingleResponsiblePrinciple;

public class Main {

    public void createOrder() {
        System.out.println("order created");
    }

    public void generateInvoice() {
        System.out.println("invoice generated");
    }

    public void sendEmail() {
        System.out.println("Email sent");
    }

    public void proceedpayment() {
        System.out.println("payment proceded");
    }

    public static void main(String[] args) {

        // lets say u have a small business were u have order this are things u required
        // create order, generate invoice , send email, proced payment etc but as the
        // rule a class should have sinle responsible if u write everything in the same
        // class it makes code complex
        // 1. readability decreases
        // 2. harder to debug
        // 3. risky the modification
        // 4. unit test maintanence

        // rule it doesnt mean a class should have sinle method it can have multiple
        // methods but the methods area of domain of methods should be same example if u
        // have any prob with order then u need to visit order class like wise for all

    }

}
