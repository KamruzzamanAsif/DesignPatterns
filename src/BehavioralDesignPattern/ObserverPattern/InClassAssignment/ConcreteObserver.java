package BehavioralDesignPattern.ObserverPattern.InClassAssignment;

public class ConcreteObserver extends Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(FileInfo fileInfo) {
        System.out.println(name + " detected a file change: " + fileInfo);
    }
}
