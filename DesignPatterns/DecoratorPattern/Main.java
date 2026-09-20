package DesignPatterns.DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();

        pizza = new MushroomDecorator(pizza);

        pizza = new OlivesDecorator(pizza);

        System.out.println("Name: " + pizza.getDiscription());
        System.out.println("Cost: " + pizza.getPrice());

    }

}

// Decorator pattern :-
// → It is a structural design pattern that allows us to add new behavior or
// features to an object dynamically.

// → It allows us to wrap an existing object and keep adding new features or
// behavior dynamically at runtime.

// if u see the example here u create only one obj u create only base pizza and
// add on has many has features u need to the pizza.