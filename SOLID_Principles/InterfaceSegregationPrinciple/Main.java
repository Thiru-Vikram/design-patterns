package SOLID_Principles.InterfaceSegregationPrinciple;

public class Main {

    public static void main(String[] args) {

        // Interface Segregation Principle

        // --> A class should not be forced to implement methods which it does not use.
        // --> Instead of creating one large interface, we should create smaller and
        // more specific interfaces.

        // for following the 4th principle we do create smaller required interfaces
        // instead of having all of them in the one place

        // now only the required feature is implemented by its children
        // --> for backend writes code, test code
        // --> qa only tests code
        // --> devops only deployes code

        // diff between the isp and lsp

        // ISP
        // A class should not be forced to implement a method that it does not want to.
        // LSP
        // A parent object can be replaced by a child object without breaking the code.
    }

}
