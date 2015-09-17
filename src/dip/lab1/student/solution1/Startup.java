package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
//        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
//        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
//        SalariedEmployee emp3 = new SalariedEmployee(90000,0);
        
        Employee[] employee = {
            new HourlyEmployee(10.50, 2020),
            new SalariedEmployee(45000, 1250),
            new SalariedEmployee(90000,0)
        };

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
//        System.out.println("Employee 1 annual compensation: " +
//            nf.format(hr.getAnnualCompensationForEmployee(emp1)));
//        System.out.println("Employee 2 annual compensation: " +
//            nf.format(hr.getAnnualCompensationForEmployee(emp2)));
//        System.out.println("Employee 3 annual compensation: " +
//            nf.format(hr.getAnnualCompensationForEmployee(emp3,
//            HRService.SALARIED_TYPE)));
        
        for(Employee i : employee){
            
            // This method works just fine
            // However, the startup class should be working with the HR class
            // to retrieve information
//            System.out.println(i.getAnnualSalary());

            
            // These variables were created locally in the function so they
            // do not get used elsewhere accidentally
            int employeeNo = 1;
            double employeeCompensation = hr.getAnnualCompensationForEmployee(i);
            System.out.println("Employee #" + employeeNo + "'s annual"
                    + " compensation: " + nf.format(employeeCompensation));
            // Adding 1 or the next employee;
            employeeNo +=1;
        }
        
    }

}
