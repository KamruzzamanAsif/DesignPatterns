package DesignPattern.InClassScenarioMakingCW.FactoryMethod;

public class Client {
    Employee employee;
    public Client(Employee employee){
        this.employee = employee;
    }


    public void seeEmployeeDetails() {
        BaseEmployeeFactory employeeFactory = new EmployeeManagerFactory().createFactory(employee);
        IEmployeeManager employeeManager = employeeFactory.create();
        employee.bonus = employeeManager.getBonus();
        employee.hourlyPay = employeeManager.getHourlyPay();
        System.out.println(employee.bonus);
        System.out.println(employee.hourlyPay);
    }
}
