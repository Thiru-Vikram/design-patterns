package DesignPatterns.Singleton.BasicImpOfSingleton;

public class Main {

    public static void main(String[] args) {

        // now we dont need to create an obj as there the method is static
        // we call the method using the class name itself
        Calculator c1 = Calculator.getObj();
        Calculator c2 = Calculator.getObj();

        c1.a = 10;
        c1.b = 5;

        c2.a = 9;
        c2.b = 1;

        System.out.println(c1.sum());
        System.out.println(c2.sum());

    }

}

// this is the basic imp of singleton
// --> now the sol is same for the both the obj as we are not creating diff objs
// here they are diff reference pointing to the same obj so at the end the ans
// is same. 10 , 10

// ok, now even in this design there is some drawback means u were creating the
// obj by yourself forcefully and when there is need we use it but its not the
// right suppose u didnt call or use any methods in that class then u already
// created the obj so it takes the memory and we end up by memory wastage.
// so we slightly improve the existing code using the lasy initailization.

// here we got the final design but it is not thread safe so will check it out.