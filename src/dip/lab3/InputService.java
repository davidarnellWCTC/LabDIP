/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author darnell
 */
public class InputService {
    
    public void readText(ITextReader r){       
            r.setTextString();
    }
    
    public String getText(ITextReader r){
        return r.getTextString();
    }
}
