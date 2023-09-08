package employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class commissionEmployee {
    
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public commissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
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

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

     public double computeSalary() {
        double commissionRate;
        if (totalSales < 50000) {
            commissionRate = 0.05; 
        } else if (totalSales >= 50000 && totalSales > 100000) {
            commissionRate = 0.20; 
        } else if (totalSales >= 100000 && totalSales > 500000) {
            commissionRate = 0.30; 
        } else {
            commissionRate = 0.50; 
        }
        return totalSales * commissionRate;
    }

    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
        System.out.println("Total Sales: ₱‎" + totalSales);
        System.out.println("Salary: ₱‎" + computeSalary());
    }

    @Override
    public String toString() {
        return "commissionEmployee{" + "empID=" + empID + ", empName=" + empName + '}';
    }
    
}
