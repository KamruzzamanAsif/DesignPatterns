package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class ContractEmployeeManager implements IEmployeeManager {
    @Override
    public double getBonus() {
        return 500;
    }

    @Override
    public double getHourlyPay() {
        return 100;
    }
}
