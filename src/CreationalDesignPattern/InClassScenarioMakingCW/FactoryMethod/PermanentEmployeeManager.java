package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class PermanentEmployeeManager implements IEmployeeManager{

    @Override
    public double getBonus() {
        return 1000;
    }

    @Override
    public double getHourlyPay() {
        return 80;
    }
}
