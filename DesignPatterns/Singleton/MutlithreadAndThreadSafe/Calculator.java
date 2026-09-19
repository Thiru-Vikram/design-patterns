package DesignPatterns.Singleton.MutlithreadAndThreadSafe;

public class Calculator {

    int a;
    int b;

    private static Calculator obj;

    private Calculator() {
        System.out.println("Instance is created");
    }

    public int sum() {
        return a + b;
    }

    // when u use synchronised keyword u only create one time u can see in output
    public static Calculator getObj() {
        // double checking mechanism
        if (obj == null) {
            synchronized (Calculator.class) {
                if (obj == null) {
                    return obj = new Calculator();
                }
            }
        }

        return obj;
    }

}

// even in this approch there is little drwaback in sychronised
// every time when 2 or more threads come and access it it waits and creates a
// log or like a queue but for us only the first time we need to check and allow
// them in line by line
// after that there is no use to check and wait so we starightly should return
// obj means that we already created
// we use the double checked locking mechanism

// it states that when 2 or more threads come and access at a time it allows it
// by one by one and
// it checks whether obj already created if created just returns or it will
// create.

// Logging System: A single logger instance writes logs
// throughout the application.

// Database Connection Manager: Only one object
// manages DB connections across the application.

// Configuration/Properties Manager: Reads application
// configuration once and shares it everywhere.