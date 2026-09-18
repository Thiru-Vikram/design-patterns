package SOLID_Principles.DependencyInversionPrinciple;

public class UserService {

    // private MySQL db1 = new MySQL();

    // public void saveUser(String data) {
    // db1.storeData(data);
    // }

    // private MongoDB db2 = new MongoDB();

    // public void saveUserMongo(String data) {
    // db2.storeDocument(data);
    // }

    // if u do like so this is called tight coupling means u need to create and obj
    // again and again and alter the existing data for each and eveytime here it is
    // directly dependent
    // so we need loose coupling by using the interface

    // this is loose coupling cause
    // we dont dont depend on all the child clases instead of one parent interface
    // so interface can have many childs
    private Database database; // this is abstraction

    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser(String user) {
        database.saveData(user);
    }

    public static void main(String[] args) {

    }

}
