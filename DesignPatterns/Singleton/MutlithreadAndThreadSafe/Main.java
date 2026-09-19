package DesignPatterns.Singleton.MutlithreadAndThreadSafe;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            Calculator.getObj();
        });

        Thread t2 = new Thread(() -> {
            Calculator.getObj();
        });

        t1.start();
        t2.start();
    }

}

// so now we are checking whether singleton is working in the mutithreading and
// is it thread safe we can do that by only adding one keyword in the obj
// creation.
