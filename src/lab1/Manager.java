package lab1;

public class Manager{

    private Employee employee;
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee eId001 = new Employee();
        
        eId001.setFirstName(firstName);
        eId001.setLastName(lastName);
        eId001.setSSN(ssn);
        employee = eId001;
        orientEmployee();
    }
    
    public void orientEmployee(){
        employee.newEmployeeOrientation("A001");
    }
    
    public String getEmployeeStatus(){
        return employee.getStatus();
    }
}


    
    
