
import  java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employees.FullTimeEmployee fullTimeEmployee = new Employees().new FullTimeEmployee("Alice", "FT123", 5000);
        Employees.PartTimeEmployees partTimeEmployee = new Employees().new PartTimeEmployees("Bob", "PT456", 20, 80);
        

        List<Employees.Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);
        
       Payroll payroll = new Payroll();
       payroll.processPayroll(employees);
    }
}

