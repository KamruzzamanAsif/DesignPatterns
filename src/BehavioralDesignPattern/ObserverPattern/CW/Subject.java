package BehavioralDesignPattern.ObserverPattern.CW;

import BehavioralDesignPattern.ObserverPattern.CW.Observer;

import java.util.*;

public class Subject {
    private List<BehavioralDesignPattern.ObserverPattern.CW.Observer> observers  = new ArrayList<>();
    public Subject() {}

    public void attach(BehavioralDesignPattern.ObserverPattern.CW.Observer observer) {
        observers.add(observer);
    }

    public void detach(BehavioralDesignPattern.ObserverPattern.CW.Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }
}
