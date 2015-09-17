package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    
 
 
    public static void main(String[] args) {
        
        
        
        TipCalculator[] tippableService = {
            new BaggageTipCalculator(TipCalculator.ServiceQuality.GOOD, 5),
            new BaggageTipCalculator(TipCalculator.ServiceQuality.FAIR, 3),
            new BaggageTipCalculator(TipCalculator.ServiceQuality.POOR, 7),
            new FoodTipCalculator(TipCalculator.ServiceQuality.POOR, 3.6),
            new FoodTipCalculator(TipCalculator.ServiceQuality.GOOD, 8.90)
        } ;
        
        TipService ts = new TipService();
       
        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        
        
        for(TipCalculator i : tippableService){
            int serviceNo = 1;
            System.out.println("Service #" + serviceNo + " gets tipped at: " 
                    + nf.format(ts.getTipAmount(i)));
            // Adding 1 on the next service;
            serviceNo +=1;
        }
        
    }

}
