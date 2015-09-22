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
public class JOptionPaneWriter implements ITextWriter{

    private String text;
    
    public JOptionPaneWriter(ITextReader r) {
        this.text = r.getTextString();
    }
    
    @Override
    public void writeText() {
        JOptionPane.showMessageDialog(null, text);
    }
    
}
