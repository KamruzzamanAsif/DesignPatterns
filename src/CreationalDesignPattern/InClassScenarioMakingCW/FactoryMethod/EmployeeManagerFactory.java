package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class EmployeeManagerFactory {
    public BaseEmployeeFactory createFactory(Employee employee){
        BaseEmployeeFactory baseEmployeeFactory = null;
        if(employee.id == 1){
            baseEmployeeFactory = new PermanentEmployeeFactory(employee);
        }
        else if(employee.id == 2){
            baseEmployeeFactory = new ContractEmployeeFactory(employee);
        }
        return baseEmployeeFactory;
    }
}
