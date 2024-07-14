    
    public abstract class AbstractEmployee implements Employee {
    
        protected String name;
        protected  String employeeId;
        String message = "Hope You Enjoy Your Work";
        //protected double hoursWorked;
        //double rate = 1000;

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