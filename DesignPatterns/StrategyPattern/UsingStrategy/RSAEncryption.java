package DesignPatterns.StrategyPattern.UsingStrategy;

public class RSAEncryption implements EncryptStrategy {

    @Override
    public void encrypt() {
        System.out.println("RSA Encryption");
    }

}
