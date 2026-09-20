package DesignPatterns.StrategyPattern.UsingStrategy;

public class GZipCompression implements CompressionStrategy {

    @Override
    public void compress() {
        System.out.println("GZip Compression");
    }

}
