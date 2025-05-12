package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}