package patterns.поведенческие.observerPattern.example2;

import java.util.ArrayList;
import java.util.List;

public abstract class UpdatedRecourse {

    List<Observer> subscribers;

    public UpdatedRecourse() {
        subscribers = new ArrayList<Observer>();
    }

    void subscribe(Observer people) {
        subscribers.add(people);
    }

    void unsubscribe(Observer people) {
        subscribers.remove(people);
    }

    abstract void notifySubscribers();
}
