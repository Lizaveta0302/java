package main.patterns.observerPattern;

import java.util.ArrayList;

public abstract class News {

    public ArrayList<Observer> people;

    public News() {
        people = new ArrayList<>();
    }

    public void subscribe(Observer person) {
        people.add(person);
    }

    public void unsubscribe(Observer person) {
        people.remove(person);
    }

    public abstract void notifyPeople();

}
