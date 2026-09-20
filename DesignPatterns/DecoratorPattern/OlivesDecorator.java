package DesignPatterns.DecoratorPattern;

public class OlivesDecorator extends PizzaDecorator {

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + " + Olives";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 150;
    }

}
