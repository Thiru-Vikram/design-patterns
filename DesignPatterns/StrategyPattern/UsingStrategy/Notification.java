package DesignPatterns.StrategyPattern.UsingStrategy;

public abstract class Notification {

    EncryptStrategy encryptStrategy;
    CompressionStrategy compressionStrategy;

    public Notification(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        this.encryptStrategy = encryptStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    abstract void send();

    void encrypt() {
        encryptStrategy.encrypt();
    }

    void compress() {
        compressionStrategy.compress();
    }
}
