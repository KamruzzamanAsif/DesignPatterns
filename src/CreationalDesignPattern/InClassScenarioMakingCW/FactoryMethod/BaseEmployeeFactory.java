package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public abstract class BaseEmployeeFactory {
    protected Employee employee;

    public BaseEmployeeFactory(Employee employee){
        this.employee = employee;
    }

    public void assignEmployeeProperties(){
        IEmployeeManager iEmployeeManager = this.create();
        employee.bonus = iEmployeeManager.getBonus();
        employee.hourlyPay = iEmployeeManager.getHourlyPay();
    }

    public abstract IEmployeeManager create();
}
