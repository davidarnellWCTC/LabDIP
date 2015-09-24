/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class JOptionPaneReader implements MessageReader {

    String text;

//    public JOptionPaneReader(String text) {
//        this.text = text;
//    }
    
    
    
    @Override
    public void setTextString() {
        this.text = JOptionPane.showInputDialog(null, "Enter the line of text: ");
    }

    @Override
    public String getTextString() {
        return text;
    } 
}
