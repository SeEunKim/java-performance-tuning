package example.ch01.transferobjectpattern;

import java.io.Serializable;

/**
 * book example p.12
 */
public class EmployeeTo implements Serializable {
    private String empName;
    private String empID;
    private String empPhone;

    public EmployeeTo() {
        super();
    }

    public EmployeeTo(String empName, String empID, String empPhone) {
        super();
        this.empName = empName;
        this.empID = empID;
        this.empPhone = empPhone;
    }

    public String getEmpName() {
            if(empName == null) {
                return "";
            } else {
                return empName;
            }
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        return "EmployeeTo{" +
                "empName='" + empName + '\'' +
                ", empID='" + empID + '\'' +
                ", empPhone='" + empPhone + '\'' +
                '}';
    }
}
