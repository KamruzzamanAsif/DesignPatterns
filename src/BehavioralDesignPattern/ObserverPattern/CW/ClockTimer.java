package BehavioralDesignPattern.ObserverPattern.CW;

public class ClockTimer extends Subject {
    public ClockTimer(){}

    public int getHour(){
        // do
        return 0;
    }

    public int getMinute(){
        // do
        return 0;
    }

    public int getSecond(){
        // do
        return 0;
    }

    public void tick(){
        // update internal time-keeping state
        notifyObservers();
    }
}
