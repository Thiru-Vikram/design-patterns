package DesignPatterns.StrategyPattern.UsingStrategy;

public class AESEncryption implements EncryptStrategy {

    @Override
    public void encrypt() {
        System.out.println("AES Encryption");
    }

}
