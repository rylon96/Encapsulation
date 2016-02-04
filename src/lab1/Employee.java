package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private String cubeId;
    private Date currentDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;


    public Employee() {
        currentDate = new Date();
    }
    public void newEmployeeOrientation(String cubeId){
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
       
    }
    private String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }
    
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        String fmtDate = formatDate();
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }
    
    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            String fmtDate = formatDate();
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            String fmtDate = formatDate();
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            String fmtDate = formatDate();
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        String fmtDate = formatDate();

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        if(firstName == null || firstName.length() < 0)
        {
            System.out.println("Enter a First Name");
        }
            this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        if(lastName == null || lastName.length() < 0)
        {
            System.out.println("Enter a Last Name");
        }
            this.lastName = lastName;
    }
    public String getSSN(){
        return ssn;
    }
    public void setSSN(String ssn){
        if(ssn == null || ssn.length() < 0)
        {
            System.out.println("Enter a SSN");
        }
            this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if(birthDate == null)
        {
            System.out.println("Enter a Birth Date");
        }
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if(cubeId == null || cubeId.length() < 0)
        {
            System.out.println("Enter a Cube Id");
        }
        this.cubeId = cubeId;
    }
    public boolean getMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean getMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean getReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean getMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }
}
