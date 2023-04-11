package BehavioralDesignPattern.COR2;

public class Purchase {
    private int number;
    private double price;
    private String purpose;

    public Purchase(int number, double price, String purpose){
        this.number = number;
        this.price = price;
        this.purpose = purpose;
    }

    public int getNumber(){return this.number;}
    public double getPrice(){return this.price;}
    public String getPurpose(){return this.purpose;}

}
