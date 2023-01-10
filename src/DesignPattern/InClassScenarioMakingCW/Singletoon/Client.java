package DesignPattern.InClassScenarioMakingCW.Singletoon;

public class Client{
    public static void main(String[] args) {
        Employee asif = new Employee("asif", "assignment-1");
        Employee asif2 = new Employee("asif","assignment-2");

        asif.printCurrentAssignment();
        asif2.printCurrentAssignment();
    }
}