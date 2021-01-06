package patterns.поведенческие.observerPattern.example2;

public class UpdatedVersionOfMusic extends UpdatedRecourse {
    //@Override
    public void update(int version) {
        System.out.println("Version " + version + " of music is available..");
    }

    @Override
    void notifySubscribers() {

    }
}
