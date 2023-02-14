package BehavioralDesignPattern.ObserverPattern.InClassAssignment;

import java.io.File;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class ConcreteSubject extends Subject {
    private File file;

    public ConcreteSubject(String filePath) {
        file = new File(filePath);
        startMonitoring();
    }

    private void startMonitoring() {
        WatchService watcher;
        try {
            watcher = FileSystems.getDefault().newWatchService();
            file.toPath().getParent().register(watcher, StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE);
            System.out.println(file.toPath().getParent());
            Thread thread = new Thread(new Watcher(watcher, file.toPath(), this));
            thread.setDaemon(true);
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public File getFile() {
        return this.file;
    }

    private static class Watcher implements Runnable {
        private WatchService watcher;
        private Path path;
        private ConcreteSubject subject;

        public Watcher(WatchService watcher, Path path, ConcreteSubject subject) {
            this.watcher = watcher;
            this.path = path;
            this.subject = subject;
        }

        @Override
        public void run() {
            try {
                WatchKey key;
                while ((key = watcher.poll(10, TimeUnit.MILLISECONDS)) != null) {
                    for (WatchEvent<?> event : key.pollEvents()) {
                        System.out.println(
                                "Event kind:" + event.kind()
                                        + ". File affected: " + event.context() + ".");
                        if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY && event.context().toString().equals(path.getFileName().toString())) {
                            subject.notifyObservers(new FileInfo(path.toFile(), "Modified"));
                        }
                        else if(event.kind() == StandardWatchEventKinds.ENTRY_DELETE && event.context().toString().equals(path.getFileName().toString())){
                            subject.notifyObservers(new FileInfo(path.toFile(), "Deleted"));
                        }
                        else if(event.kind() == StandardWatchEventKinds.ENTRY_CREATE && event.context().toString().equals(path.getFileName().toString())){
                            subject.notifyObservers(new FileInfo(path.toFile(), "Created"));
                        }
                    }
                    key.reset();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
