package DesignPatterns.DecoratorPattern;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDiscription() {
        return "Margherita Pizza";
    }

    @Override
    public int getPrice() {
        return 200;
    }

}
