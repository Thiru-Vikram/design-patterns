package SOLID_Principles.DependencyInversionPrinciple;

public class MongoDB implements Database {

    @Override
    public void saveData(String data) {
        System.out.println("this is mongo db" + data);
    }

    // public void storeDocument(String data) {
    // System.out.println("Document is stored in mongodb" + data);
    // }

}
