package lab1;

public class Manager{

    private Employee employee;
    
    public void newEmployeeOrientation(String firstName, String lastName, String ssn){
        Employee eId001 = new Employee();
        
        eId001.setFirstName(firstName);
        eId001.setLastName(lastName);
        eId001.setSSN(ssn);
        eId001.newEmployeeOrientation("A001");
        employee = eId001;
    }
    
    public String getEmployeeStatus(){
        return employee.getStatus();
    }
    }


    
    
