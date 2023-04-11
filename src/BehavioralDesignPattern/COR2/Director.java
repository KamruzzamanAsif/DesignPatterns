package BehavioralDesignPattern.COR2;

public class Director extends Approver{

    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getPrice() < 50000){
            System.out.println("Director approves");
        }
        else if(successor != null){
            successor.processRequest(purchase);
        }
    }
}
