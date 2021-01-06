package patterns.структурные.adapterPattern.example2;

public class TrainyProgram implements Program {
    @Override
    public void saveObject() {
        System.out.println("Saving object into db..");
    }

    @Override
    public void deleteObject() {
        System.out.println("Deleting object from db..");
    }
}
