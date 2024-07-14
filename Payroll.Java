import java.util.List;

public class Payroll {
    public Payroll(List<Employee> employees) {
        for (Employee employee : Employee) {
            System.out.println(employee.work());
            System.out.println("Employee Info: \n" + employee.getEmployeeInfo());
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println("-------------");
        }
    }
}
