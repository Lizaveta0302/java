package patterns.поведенческие.observerPattern.example1;

public class TVNews extends News {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyPeople();
    }

    @Override
    public void notifyPeople() {
        for (Observer ob : people) {
            ob.update(number);
        }
    }
}
