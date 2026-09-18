package SOLID_Principles.InterfaceSegregationPrinciple;

public class BackendDeveloper implements Coder, Tester {

    @Override
    public void writeCode() {
        System.out.println("writes the code");
    }

    @Override
    public void testApplication() {
        System.out.println("tests the applications");
    }

    // @Override
    // public void deployApplication() {
    // throw new UnsupportedOperationException("Unimplemented method
    // 'deployApplication'");
    // }

}
