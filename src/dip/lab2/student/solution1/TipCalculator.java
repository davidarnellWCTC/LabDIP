/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author David
 */
public interface TipCalculator {
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
        
    public abstract double getTip();
    
    public abstract void setServiceQuality(ServiceQuality q);
    public abstract ServiceQuality getServiceQuality();
    
    // Everything that inherits from TipCalculator will base the tip on the
    // rate determined by the ServiceQuality
    // Each class should be able to have the rates changed
    public abstract void setGOOD_RATE(double GOOD_RATE);
    public abstract double getGOOD_RATE();
    public abstract void setFAIR_RATE(double FAIR_RATE);
    public abstract double getFAIR_RATE();
    public abstract void setPOOR_RATE(double POOR_RATE);
    public abstract double getPOOR_RATE();    
    
}
