package BehavioralDesignPattern.ObserverPattern.InClassAssignment;

import java.io.File;
import java.time.LocalDateTime;

public class FileInfo {
    private File file;
    private String type;
    private LocalDateTime time;

    public FileInfo(File file, String type) {
        this.file = file;
        this.type = type;
        time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "File " + file.getName() + " " + type + " at " + time;
    }
}
