package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    
    private double employeeAnnualCompensation;
    /** 
     * Constants can be used for retrieving annual wages of
     * various employee types. Is this the best way to go? Do we have
     * type safety?
     */
//    public static final String SALARIED_TYPE = "Salaried";
//    public static final String HOURLY_TYPE = "Hourly";

//    public abstract double getAnnualSalary();
    
    public double getAnnualCompensationForEmployee(Employee employee){
        // this method has the hourly and salaried classes calculate their pay
        // The pay should be calculated by the HRService class since
        // calculating pay is what HR does.
        
//        double annualCompensation;
//        // The DIP works so that I don't need to check the type of
        // employee the employee object is
//        if(employee instanceof HourlyEmployee ){
//            annualCompensation = employee.getAnnualSalary();
//        }
        
////        employeeAnnualCompensation = employee.getAnnualSalary();        
        return employee.getAnnualSalary();
    }
    
//    @Override
//    public double getAnnualSalary() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety?
     */
//    public enum WageType {
//        SALARIED,
//        HOURLY
//    }

//    private static final String ERROR_MSG =
//            "Cannot get annual wages because no valid employee type provided";
//    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * This is a truly horrible way to make decisions. Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * employeeType - a String identifying the employee type. A constant
     * (see above) should be used for this, but can you guarantee it will be?
     * Are there other options? Hint: enum
     * @return the annual compensation for supported employee types
     */
//    public double getAnnualCompensationForEmployee(Employee e,
//            String employeeType)
//    {
//        double annualCompensation = 0;
//
//        // One example of using fragile if logic to determine employee type.
//        // If only we could use polymorphism instead!
//        if(employeeType.equals(HOURLY_TYPE)) {
//            annualCompensation = e.getAnnualWages();
//
//        } else if(employeeType.equals(SALARIED_TYPE)) {
//            annualCompensation = e.getAnnualSalary();
//
//        } else {
//            JOptionPane.showMessageDialog(
//                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
//        }
//
//        return annualCompensation;
//    }


    /**
     * This is another truly horrible way to make decisions.
     * Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * @return the annual compensation for supported employee types
     */
//    public double getAnnualCompensationForEmployee(Employee e) {
//        double annualCompensation = 0;
//
//        // One example of using fragile if logic to determine employee type.
//        // If only we could use polymorphism!
//        // NOTE: you don't need both versions (the one above and this one).
//        // Find a single, better way, using DIP principles.
//        if(e instanceof HourlyEmployee) {
//            annualCompensation = e.getAnnualWages();
//
//        } else if(e instanceof SalariedEmployee) {
//            annualCompensation = e.getAnnualSalary();
//
//        } else {
//            JOptionPane.showMessageDialog(
//                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
//        }
//
//        return annualCompensation;
//    }
}