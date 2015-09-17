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
public class TipService {
    
    // The TipService class access the TipCalculator interface to get the tipAmount
    public double getTipAmount(TipCalculator t){       
        return t.getTip();
    }    
}
