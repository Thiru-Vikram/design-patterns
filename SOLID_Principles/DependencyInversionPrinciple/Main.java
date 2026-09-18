package SOLID_Principles.DependencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {

        // Dependency Inversion Principle
        // High-level modules should not depend on low-level modules.
        // Both should depend on abstractions.

        // Instead of one class directly depending on another
        // concrete class, we should depend on interfaces. why cause it creates the
        // loose coupling

        // so Loosely coupled code is easier to maintain,
        // easier to scale, and easier to modify in the future.

        // now the same database can act like the both the childs
        UserService u1 = new UserService(new MongoDB());
        u1.saveUser("thiru");

        UserService u2 = new UserService(new MySQL());
        u2.saveUser("vikram");

    }

}
