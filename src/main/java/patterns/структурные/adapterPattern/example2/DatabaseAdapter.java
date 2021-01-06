package patterns.структурные.adapterPattern.example2;

public class DatabaseAdapter extends MysqlDatabase implements Program {
    @Override
    public void saveObject() {
        insert();
    }

    @Override
    public void deleteObject() {
        delete();
    }

    public static void main(String[] args) {
        DatabaseAdapter adapter = new DatabaseAdapter();
        adapter.insert();
        adapter.delete();
    }
}
