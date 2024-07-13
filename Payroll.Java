import java.util.List;

public class Payroll {

    public void processPayroll(List<Employees.Employee> employees) {
        for (Employees.Employee employee : employees) {
            System.out.println(employee.work());
            System.out.println("Employee Info: \n" + employee.getEmployeeInfo());
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println("-------------");
        }
    }
}
