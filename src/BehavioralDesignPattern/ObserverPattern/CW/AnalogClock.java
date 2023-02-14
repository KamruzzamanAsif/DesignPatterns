package BehavioralDesignPattern.ObserverPattern.CW;

public class AnalogClock extends Observer {
    private ClockTimer clockTimer;
    public AnalogClock(ClockTimer clockTimer) {
        this.clockTimer = clockTimer;
        this.clockTimer.attach(this);
    }
    @Override
    public void update(Subject theChangedSubject) {
        if(theChangedSubject == this.clockTimer){
            draw();
        }
    }

    public void draw() {
        // analog's own logic

        // get the new values from the subject
        int hour = clockTimer.getHour();
        int minute = clockTimer.getMinute();
        // etc.
        // draw the digital clock
    }
}

