public class Employees {

    public interface Employee {

        String work ();
        double calculateSalary();
        String getEmployeeInfo();
    
    }
    
    public abstract class AbstractEmployee implements Employee {
    
        protected String name;
        protected  String employeeId;
        //protected double hoursWorked;
        double rate = 1000;

        public AbstractEmployee(String name, String employeeId){
            this.name=name;
            this.employeeId =employeeId;
            //this.hoursWorked = hoursWorked;
        }

        @Override
        public String getEmployeeInfo(){
            return "name: " + name + "\nEmployee Id: " + employeeId;
        }
        
        @Override
        public String work(){
            return null;
        };

        @Override
        public  double calculateSalary(){
            return 0;
        };

        
    }

    public class FullTimeEmployee extends AbstractEmployee{

        double monthlySalary;
        static String message = "Hope You Enjoy Your Work";

        public FullTimeEmployee(String name, String employeeId, double monthlySalary) {

            super(name, employeeId);
            this.monthlySalary = monthlySalary;
            
        }

        @Override
        public String work(){
            return message;
        }

        @Override
        public double calculateSalary(){
            return monthlySalary;
        }
        

    }

    public class PartTimeEmployees extends AbstractEmployee{

        private double hourlyRate;
        private double hoursWorked;

        public PartTimeEmployees(double hourlyRate, double hoursWorked){

            super(name, employeeId);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;

        }
        
        @Override
        public double calculateSalary(){
            return hourlyRate * hoursWorked;
        }
    
        
    }
    
    
    
}

