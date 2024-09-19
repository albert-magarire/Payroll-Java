import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        EmployeeProcessor processor = new EmployeeProcessor();
        ArrayList<Employee> employeeList = processor.getEmployeeList("employees.txt"); //note that I also have a 'employees.csv' file, I just used it to create the txt file, I may forget to delete it
        processor.showEmployeeList(employeeList);
    }
}
