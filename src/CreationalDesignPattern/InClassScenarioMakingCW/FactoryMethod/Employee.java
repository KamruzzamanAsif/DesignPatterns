package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class Employee {
    protected int id;
    protected double bonus;
    protected double hourlyPay;

    public Employee(int id, double bonus, double hourlyPay){
        this.id = id;
        this.bonus = bonus;
        this.hourlyPay = hourlyPay;
    }
}
