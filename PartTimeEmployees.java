public class PartTimeEmployees extends AbstractEmployee{

    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployees(String name,String employeeId,double hourlyRate, double hoursWorked){

        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public String work(){
        return super.message;
    }
    
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getEmployeeInfo(){
        return "name: " + name + "\nEmployee Id: " + employeeId + " \nHours works: "
        + hoursWorked +""+"\nHourly wage: " + calculateSalary();
    }  
}

