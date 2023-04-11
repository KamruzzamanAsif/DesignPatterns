package BehavioralDesignPattern.COR2;

public abstract class Approver {
    protected Approver successor;

    public void setSuccessor(Approver successor) {this.successor = successor;}

    public abstract void processRequest(Purchase purchase);
}
