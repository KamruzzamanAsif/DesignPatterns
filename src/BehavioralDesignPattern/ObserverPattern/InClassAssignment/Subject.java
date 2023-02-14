package BehavioralDesignPattern.ObserverPattern.InClassAssignment;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(FileInfo fileInfo) {
        for (Observer observer : observers) {
            observer.update(fileInfo);
        }
    }
}
