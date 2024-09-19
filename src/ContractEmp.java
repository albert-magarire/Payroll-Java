public class ContractEmp extends Employee {
    private double monthlyPay;
    private int contractDuration;

    //Constructor for CONTRACT EMPLOYEE
    public ContractEmp(String name, String role, int yearsOfService, double taxPercent, double monthlyPay, int contractDuration) {
        super(name, role, yearsOfService, taxPercent);
        setMonthlyPay(monthlyPay);
        setContractDuration(contractDuration);
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        //Data Validation for number of number of months, should never be negative
        if (monthlyPay > 0) {
            this.monthlyPay = monthlyPay;
        } else {
            throw new IllegalArgumentException("Monthly pay must be greater than 0.");
        }
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        //Data Validation for Duration of Contract, should never be negative
        if (contractDuration > 0) {
            this.contractDuration = contractDuration;
        } else {
            throw new IllegalArgumentException("Contract duration must be greater than 0.");
        }
    }

    @Override
    public double getGrossPay() {
        return monthlyPay * contractDuration;
    }

    @Override
    public double getNetPay() {
        return getGrossPay() * (1 - gettaxPercent() / 100);
    }
}
