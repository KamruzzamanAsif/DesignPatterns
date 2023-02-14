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

    public File getFile() {
        return this.file;
    }

    private void startMonitoring() {
        WatchService watcher;
        try {
            watcher = FileSystems.getDefault().newWatchService();
            Path dirToWatch = Paths.get("src/BehavioralDesignPattern/ObserverPattern/InClassAssignment/Files/");
            dirToWatch.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
            Thread thread = new Thread(new Watcher(watcher, file.toPath(), this));
            thread.setDaemon(true);
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                while (true) {
                    WatchKey key = watcher.poll(10, TimeUnit.MILLISECONDS);
                    if (key != null) {
                        for (WatchEvent<?> event : key.pollEvents()) {
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
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
