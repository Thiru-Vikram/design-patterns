package DesignPatterns.AdaptorPattern.UsingAdaptor;

public interface PaymentService {

    String pay(int amount, int customerId);

}
// so for using adaptor we make this as abstract
// so u dont change here nothing and u dont change nothing in client
// only u just as much u need the child classes and implement the payment
// service
// and use create the adaptors for each child and u plug n play thats is this is
// how u work with the adaptors.
