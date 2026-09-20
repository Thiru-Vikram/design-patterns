package DesignPatterns.StrategyPattern.UsingStrategy;

public class Push extends Notification {

    public Push(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        super(encryptStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending push");
    }
}
