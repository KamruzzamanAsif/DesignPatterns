package DesignPattern.InClassScenarioMakingCW.Singletoon;

public class Employee {
    private final String name;
    private final String task;
    public Employee(String name, String task) {
        this.name = name;
        this.task = task;
    }
    public void printCurrentAssignment(){
        Printer printer = Printer.getInstance();
        printer.print(task);
    }
}