package DesignPatterns.Singleton.BasicImpOfSingleton;

public class Calculator {

    int a;
    int b;

    // create the obj in the class itself and make it private
    // why static to pass this obj in the method so that there we dont need to
    // create and obj again to call the func
    // private static Calculator obj = new Calculator();

    // create the private constructor
    private Calculator() {
        System.out.println("Instance created");
    }

    public int sum() {
        return a + b;
    }

    // pass the above obj through this method it is public
    // public static Calculator getObj() {
    // return obj;
    // }

    // this is called lazy initialization
    private static Calculator obj;

    // u only create obj when the method is called if its already created u pass it
    // up if not u create new one.
    public static Calculator getObj() {
        if (obj == null) {
            obj = new Calculator();
        }
        return obj;
    }

}