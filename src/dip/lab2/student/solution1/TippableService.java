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
public interface TippableService {
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    public abstract double getTip();

    
}
