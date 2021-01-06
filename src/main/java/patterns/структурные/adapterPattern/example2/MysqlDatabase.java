package patterns.структурные.adapterPattern.example2;

public class MysqlDatabase implements Database {
    @Override
    public void insert() {
        System.out.println("Insertion into MysqlDatabase..");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from MysqlDatabase..");
    }
}
