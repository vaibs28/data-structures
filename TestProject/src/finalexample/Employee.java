package finalexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Employee {

    private final int empId;
    private final String empName;
    //private final Date dob;
    
    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
        //this.dob = dob;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
    
    

    /*public Date getDob() {
        return dob;
    }*/
    
   @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }

public static void main(String[] args) throws ParseException {
       //Date dob = new Date();
       //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       //dob = sdf.parse("1992-07-26");
       //final Date dob1 = new Date(dob.getTime());
       Employee emp = new Employee(1, "Vaibhav");
       //dob1.setDate(11);
       //System.out.println(emp.getDob());
   }
}
