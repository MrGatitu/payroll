public class EmployeeManagementSystem {

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", "FT123", 5000);
        PartTimeEmployees partTimeEmployee = new PartTimeEmployees("Bob", "PT456", 20, 80);

        System.out.println(fullTimeEmployee.work());
        System.out.println("Employee Info: \n" + fullTimeEmployee.getEmployeeInfo());
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("-------------");


        System.out.println(partTimeEmployee.work());
        System.out.println("Employee Info: \n" + partTimeEmployee.getEmployeeInfo());
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
        System.out.println("-------------");
    }
}

