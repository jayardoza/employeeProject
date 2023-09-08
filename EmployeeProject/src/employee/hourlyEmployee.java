package employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hourlyEmployee {
    
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public hourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getempDateHired() {
        return empDateHired;
    }

    public void setempDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getempBirthDate() {
        return empBirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.empBirthDate = BirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRateePerHour(float rateePerHour) {
        this.ratePerHour = rateePerHour;
    }
   

public double computeSalary() {
        double regularPay = totalHoursWorked <= 40 ? totalHoursWorked * ratePerHour : 40 * ratePerHour;
        double overtimePay = totalHoursWorked > 40 ? (totalHoursWorked - 40) * (1.5 * ratePerHour) : 0;
        return regularPay + overtimePay;
    }

   
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: ₱‎" + ratePerHour);
        System.out.println("Salary: ₱‎" + computeSalary());
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" + "empID=" + empID + ", empName=" + empName + '}';
    }
    
    
}

