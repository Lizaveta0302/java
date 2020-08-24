package patterns.observerPattern;

public class TVNewsSubscriber implements Observer {

    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public void update(int number) {
        this.number = number;
    }
}
