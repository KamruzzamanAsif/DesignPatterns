package refactoring.Scenario;

import java.util.LinkedList;
import java.util.Queue;

public class PrintJob {
    private Queue<PrintRequest> printQueue;
    private PrioritySetting prioritySetting;

    public PrintJob() {
        this.printQueue = new LinkedList<PrintRequest>();
    }

    public void pullJob() {
        // send a specific job to production based on the priority setting
    }

    public void changePriority(PrintRequest request, int newPriority) {
        // change the priority of the given PrintRequest
    }

}
