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
public class Startup {
    
    public static void main(String[] args) {
        
        // Texting the objects
        
        MessageReader readTest = new ConsoleReader();
        
        //readTest.setTextString();
        
        InputService is = new InputService();
        OutputService os = new OutputService();
        
        is.readText(readTest);
        
        MessageWriter writeTest = new ConsoleWriter(readTest);
        
        os.writeText(writeTest); 
        
    }
    
}
