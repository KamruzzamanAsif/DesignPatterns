package refactoring.Scenario;

import java.util.LinkedList;
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

    // Feature Envy smell , Black Sheep//
    public void changePriority(PrintRequest request, int newPriority) {
        // change the priority of the given PrintRequest
    }

}
