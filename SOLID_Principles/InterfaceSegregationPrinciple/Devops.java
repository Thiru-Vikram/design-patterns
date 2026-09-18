package SOLID_Principles.InterfaceSegregationPrinciple;

public class Devops implements Deploy {

    // @Override
    // public void writeCode() {
    // throw new UnsupportedOperationException("Unimplemented method 'writeCode'");
    // }

    // @Override
    // public void testApplication() {
    // throw new UnsupportedOperationException("Unimplemented method
    // 'testApplication'");
    // }

    @Override
    public void deployApplication() {
        System.out.println("deployes the application");
    }

}
