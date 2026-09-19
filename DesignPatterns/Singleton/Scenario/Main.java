package DesignPatterns.Singleton.Scenario;

public class Main {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.a = 10;
        c1.b = 5;

        c2.a = 9;
        c2.b = 1;

        System.out.println(c1.sum());
        System.out.println(c2.sum());

    }

}

// what is singleton it means a class should have only one obj for the entire
// applicaiton but in this design have have created 2 objs and calling the func
// which gives 2 different answers. so we will write basic impl of singleton
// answer is 15, 10