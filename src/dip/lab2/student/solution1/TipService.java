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
    
    public double getTipAmount(TippableService t){       
        return t.getTip();
    }    
}
