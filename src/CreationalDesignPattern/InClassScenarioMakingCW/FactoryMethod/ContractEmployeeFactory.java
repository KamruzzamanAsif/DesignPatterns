package CreationalDesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class ContractEmployeeFactory extends BaseEmployeeFactory {
    public ContractEmployeeFactory(Employee employee){
        super(employee);
    }

    @Override
    public IEmployeeManager create() {
        ContractEmployeeManager contractEmployeeManager = new ContractEmployeeManager();
        //employee.medicalAllowence = contractEmployeeManager.getMedicalAllowence();
        return contractEmployeeManager;
    }
}
