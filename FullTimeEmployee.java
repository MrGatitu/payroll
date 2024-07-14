public class FullTimeEmployee extends AbstractEmployee{

    double monthlySalary;
    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {

        super(name, employeeId);
        this.monthlySalary = monthlySalary;
        
    }

    @Override
    public String work(){
        return super.message;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
    

}