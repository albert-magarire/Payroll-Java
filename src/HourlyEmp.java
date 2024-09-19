public class HourlyEmp extends Employee {
    private double hours;
    private double hourlyRate;

    //Comstructor for HOURLY EMPLOYEE
    public HourlyEmp(String name, String role, int yearsOfService, double taxPercent, double hours, double hourlyRate) {
        super(name, role, yearsOfService, taxPercent);
        setHours(hours);
        setHourlyRate(hourlyRate);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        //Data Validation for number of hours worked, should never be negative
        if (hours >= 0) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must be non-negative.");
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        //Data Validation for Rate per Hour, should never be negative
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        } else {
            throw new IllegalArgumentException("Hourly rate must be greater than 0.");
        }
    }

    @Override
    public double getGrossPay() {
        return hours * hourlyRate;
    }

    @Override
    public double getNetPay() {
        return getGrossPay() * (1 - gettaxPercent() / 100);
    }
}
