package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    // 
    private double hourlyRate;
    private double totalHrsForYear;
    
    //private double totalAnnualPay;

    
    // This constructor is used by the startup class when a specific instance
    // of this class is made
    // Each constructor takes in 2 doubles, the class figures out what
    // the annual pay is
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
//        this.hourlyRate = hourlyRate;
//        this.totalHrsForYear = totalHrsForYear;               
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        if(hourlyRate < 0) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }            
    
    
    public double getTotalHrsForYear(){
        return totalHrsForYear;
    }
    
    public void setTotalHrsForYear(double totalHrsForYear){
        if(totalHrsForYear < 0) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
    
    
    /** default constructor. Is this the best way to go? */
//    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    


    @Override
    public double getTotalAnnualPay() {
//        totalAnnualPay = hourlyRate * totalHrsForYear;
//        return totalAnnualPay;
        return hourlyRate * totalHrsForYear;
    }

}
