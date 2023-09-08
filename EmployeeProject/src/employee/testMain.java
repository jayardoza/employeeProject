package employee;

import employee.version1.basePlusCommissionEmployee;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testMain {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        basePlusCommissionEmployee employee1 = new basePlusCommissionEmployee(1, "Derrick Rose", dateFormat.parse("2023-02-13"), dateFormat.parse("1998-10-4"), 50000, 5000);
        basePlusCommissionEmployee employee2 = new basePlusCommissionEmployee(2, "JR Smith", dateFormat.parse("2022-02-12"), dateFormat.parse("1985-09-09"), 65000, 7000);

        System.out.println("Employee 1 Information:\n");
        employee1.displayInfo();
        System.out.println();

        System.out.println("\nEmployee 2 Information:\n");
        employee2.displayInfo();
    }
}

