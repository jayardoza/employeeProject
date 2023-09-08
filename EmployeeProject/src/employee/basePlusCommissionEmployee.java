package employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class basePlusCommissionEmployee {
    
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;

    public basePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

   
    public double computeSalary() {
        double commissionRate;
        double commission = getTotalSales(); 
            if (commission < 50000) {
                commissionRate = 0.05; 
            } else if (commission >= 50000 && commission > 100000) {
                commissionRate = 0.20; 
            } else if (commission >= 100000 && commission > 500000) {
                commissionRate = 0.30; 
            } else {
                commissionRate = 0.50; 
            }

        commission *= commissionRate; 
        return commission + getBaseSalary();
}

    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Date of Birth: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Sales: ₱‎" + getTotalSales());
        System.out.println("Base Salary: ₱‎" + baseSalary);
        System.out.println("Salary: ₱‎" + computeSalary());
    }
    
    @Override
    public String toString() {
        return "basePlusCommissionEmployee{" + "empID=" + empID + ", empName=" + empName + '}';
    }
    
}
