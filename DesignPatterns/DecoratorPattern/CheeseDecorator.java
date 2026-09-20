package DesignPatterns.DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + " + Cheese";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 50;
    }

}
