package BehavioralDesignPattern.COR2;

public class Client {
    public static void main(String[] args) {
        Approver john = new President();
        Approver sam = new Director();

        john.setSuccessor(sam);

        Purchase p1 = new Purchase(1, 40000, "X");
        Purchase p2 = new Purchase(2, 80000, "Y");

        john.processRequest(p1);
        john.processRequest(p2);
    }
}
