package SOLID_Principles.DependencyInversionPrinciple;

public class MySQL implements Database {

    // public void storeData(String data) {
    // System.out.println("data is stored in mysql" + data);
    // }

    @Override
    public void saveData(String data) {
        System.out.println("this is mysql" + data);
    }

}
