package SOLID_Principles.InterfaceSegregationPrinciple;

public class QADeveloper implements Tester {

    // @Override
    // public void writeCode() {
    // throw new UnsupportedOperationException("Unimplemented method 'writeCode'");
    // }

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
