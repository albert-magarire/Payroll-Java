import java.util.ArrayList;

public class EmployeeProcessor {

    public ArrayList<Employee> getEmployeeList(String fileName) {
        ArrayList<String> inputList = MyFile.readFile(fileName);  
        ArrayList<Employee> outputList = new ArrayList<>();    

        for (String line : inputList) {
            String[] data = line.split(",");
            String role = data[0];
            String name = data[1];
            int yearsOfService = Integer.parseInt(data[2]);
            double taxPercent = Double.parseDouble(data[3]);

            switch (role) {
                case "1": // Salaried Employee
                    double salary = Double.parseDouble(data[4]);
                    outputList.add(new SalariedEmp(name, role, yearsOfService, taxPercent, salary));
                    break;
                case "2": // Hourly Employee
                    double hours = Double.parseDouble(data[4]);
                    double hourlyRate = Double.parseDouble(data[5]);
                    outputList.add(new HourlyEmp(name, role, yearsOfService, taxPercent, hours, hourlyRate));
                    break;
                case "3": // Contract Employee
                    double monthlyPay = Double.parseDouble(data[4]);
                    int contractDuration = Integer.parseInt(data[5]);
                    outputList.add(new ContractEmp(name, role, yearsOfService, taxPercent, monthlyPay, contractDuration));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid role type.");
            }
        }
        return outputList;
    }

    public void showEmployeeList(ArrayList<Employee> list) {
        for (Employee emp : list) {
            System.out.println(emp.toString()); 
        }
    }
}
