package refactoring.Assignment_2;

import refactoring.Scenario.PrintRequest;
import refactoring.Scenario.PrioritySetting;

import java.util.Queue;

public class PrintJob {
    private Queue<PrintRequest> printQueue;
    private PrioritySetting prioritySetting;

    public PrintJob(Queue<PrintRequest> printQueue) {
        this.printQueue = printQueue;
    }

    public void pullJob() {
        // send a specific job to production based on the priority setting
    }
}