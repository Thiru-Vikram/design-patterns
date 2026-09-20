package DesignPatterns.StrategyPattern.UsingStrategy;

public class Email extends Notification {

    public Email(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        super(encryptStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email");
    }

}
