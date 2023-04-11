package BehavioralDesignPattern.COR2;

public class President extends Approver{

    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getPrice() > 50000){
            System.out.println("President approves");
        }
        else if(successor != null){
            successor.processRequest(purchase);
        }
    }
}
