package BehavioralDesignPattern.ObserverPattern.InClassAssignment;

import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("src/BehavioralDesignPattern/ObserverPattern/InClassAssignment/test.txt");
        subject.registerObserver(new ConcreteObserver("Monitor 1"));
        subject.registerObserver(new ConcreteObserver("Monitor 2"));

        // Simulate changes to the file being monitored
        try {
            Thread.sleep(1000);
            // Modify the file
            Files.write(subject.getFile().toPath(), "new content".getBytes(), StandardOpenOption.APPEND);
            Thread.sleep(1000);
//            // Delete the file
//            Files.delete(subject.getFile().toPath());
//            Thread.sleep(1000);
//            // Recreate the file
//            Files.write(subject.getFile().toPath(), "recreated content".getBytes());
//            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
