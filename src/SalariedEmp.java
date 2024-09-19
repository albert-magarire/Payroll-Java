public class SalariedEmp extends Employee {
    private double salary;

    // Constructor for SALARIED EMPLOYER
    public SalariedEmp(String name, String role, int yearsOfService, double taxPercent, double salary) {
        super(name, role, yearsOfService, taxPercent);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //Data validation for salary values
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than 0.");
        }
    }

    @Override
    public double getGrossPay() {
        return salary;
    }

    @Override
    public double getNetPay() {
        return salary * (1 - gettaxPercent() / 100);
    }
}
