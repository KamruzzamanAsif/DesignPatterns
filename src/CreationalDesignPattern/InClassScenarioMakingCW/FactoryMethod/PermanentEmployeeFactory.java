package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class PermanentEmployeeFactory extends BaseEmployeeFactory{

    public PermanentEmployeeFactory(Employee employee){
        super(employee);
    }

    @Override
    public IEmployeeManager create() {
        PermanentEmployeeManager permanentEmployeeManager = new PermanentEmployeeManager();
        //employee.medicalAllowence = permanentEmployeeManager.getHouseAllowence();
        return permanentEmployeeManager;
    }
}
