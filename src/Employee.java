public class Employee {
    //Declaring all the variables that I will use for all employees regardless of their role
    private String name;
    private String role;
    private int yearsOfService;
    private double taxPercent;

    // Default constructor for the Employee object
    public Employee(String name, String role, int yearsOfService, double taxPercent) {
        setName(name);
        setRole(role);
        setYearsOfService(yearsOfService);
        settaxPercent(taxPercent);
    }

    // Universal getter and setter methods that will be used
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Data validation for name
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        //Data validation to make sure we have a role from the file
        if (role != null && !role.isEmpty()) {
            this.role = role;
        } else {
            throw new IllegalArgumentException("Role cannot be empty.");
        }
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        //Dta validation to make sure number of years is positive
        if (yearsOfService >= 0) {
            this.yearsOfService = yearsOfService;
        } else {
            throw new IllegalArgumentException("Years of service must be non-negative.");
        }
    }

    public double gettaxPercent() {
        return taxPercent;
    }

    public void settaxPercent(double taxPercent) {
        //Tax percentage should not be negative and also should not exceed 100
        if (taxPercent >= 0 && taxPercent <= 100) {
            this.taxPercent = taxPercent;
        } else {
            throw new IllegalArgumentException("Tax percent must be between 0 and 100.");
        }
    }

    // Defaulting the NetPay and GrossPay methods(They will be overriden)
    public double getNetPay() {
        return 0;
    }

    public double getGrossPay() {
        return 0;
    }

    // Formatting the output that will print out. NetPay and GrossPay are Polymorphic
    @Override
    public String toString() {
        return "Name: " + name + "       Role: " + role + "       Net Pay: " + getNetPay() + "       Gross Pay: " + getGrossPay();
    }
}
