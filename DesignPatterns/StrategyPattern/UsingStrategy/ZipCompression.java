package DesignPatterns.StrategyPattern.UsingStrategy;

public class ZipCompression implements CompressionStrategy {

    @Override
    public void compress() {
        System.out.println("Zip Compressoin");
    }

}
