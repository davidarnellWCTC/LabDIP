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
public class ConsoleReader implements ITextReader {

    private String text;

    @Override
    public void setTextString(String text) {
        this.text = text;
    }

    @Override
    public String getTextString() {
        return text;
    }
    


    
}
