interface Payable {
    public void getPayableAmount();
}

abstract class Employee implements Payable{
    String name;
    int id;
    double baseSalary;
    boolean Strahovka;

    public Employee(String name, int id, double baseSalary, boolean strahovka) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.Strahovka = strahovka;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID:" + id + ", Name: " + name + ", Base Salary: " + baseSalary + ", Medical Aid: " + Strahovka);
    }
}

class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary, true);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }
    @Override
    public void getPayableAmount() {
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
class ContractEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, 0, false);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public void getPayableAmount() {
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class Employee_Management_System {
    public static void main(String[] args) {
    Employee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000);
    Employee contractorEmp = new ContractEmployee("Mary", 102, 5000, 1);
    fullTimeEmp.displayEmployeeInfo();
    fullTimeEmp.getPayableAmount();

    System.out.println();
    contractorEmp.displayEmployeeInfo();
    contractorEmp.getPayableAmount();




}


}
