package BehavioralDesignPattern.ObserverPattern.CW;

import BehavioralDesignPattern.ObserverPattern.CW.AnalogClock;
import BehavioralDesignPattern.ObserverPattern.CW.ClockTimer;
import BehavioralDesignPattern.ObserverPattern.CW.DigitalClock;

public class Main {
    public static void main(String[] args) {
        ClockTimer clockTimer = new  ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        AnalogClock analogClock = new AnalogClock(clockTimer);
    }
}
