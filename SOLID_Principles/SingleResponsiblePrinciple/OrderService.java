package SOLID_Principles.SingleResponsiblePrinciple;

class OrderService {

    public void createOrder() {
        System.out.println("order is created");
    }

    public void cancelOrder() {
        System.out.println("order is canceled");
    }

    public void updateOrder() {
        System.out.println("order is updated");
    }

    // here u can see it have many methods but the domain here only when there is
    // prob with order realted queries u come here and modify
}
