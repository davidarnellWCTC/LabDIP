/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author David
 */
public class ConsoleWriter implements MessageWriter {

    private String text;
    
    public ConsoleWriter(MessageReader r) {
        this.text = r.getTextString();
    }

    
    
    @Override
    public void writeText() {
        System.out.println(text);
    }
    
}
