package DesignPatterns.DecoratorPattern;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + " + Mushroom";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 100;
    }

}
