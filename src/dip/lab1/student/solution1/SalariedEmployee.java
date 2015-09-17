package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
    

    private double annualBonus;
    private double annualSalary;
    
    private double totalAnnualPay;

        public SalariedEmployee(double annualSalary, double annualBonus) {
//        setAnnualSalary(annualSalary);
//        setAnnualBonus(annualBonus);
            this.annualSalary = annualSalary;
            this.annualBonus = annualBonus;
    }
    
    @Override
    public double getAnnualSalary() {
        // The annual pay for a salaried employee is calculated by adding
        // the annual bonus to the annual salary
        totalAnnualPay = annualBonus + annualSalary;
        return totalAnnualPay;
    }
    /** default constructor. Is this the best way to go? */
//    public SalariedEmployee() {}
//
//    /**
//     * Convenience constructor. Is this the best way to go?
//     * @param annualSalary - the employee's annual salary
//     * @param annualBonus - a bonus benefit, if any
//     */
//    public SalariedEmployee(double annualSalary, double annualBonus) {
//        setAnnualSalary(annualSalary);
//        setAnnualBonus(annualBonus);
//    }

    
}
