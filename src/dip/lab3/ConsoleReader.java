/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author darnell
 */
public class ConsoleReader implements MessageReader {
    
    Scanner scanner = new Scanner(System.in);

    private String text; 

//    public ConsoleReader(String text) {
//        this.text = text;
//    }    

    @Override
    public void setTextString() {
        System.out.println("Enter the line of text: ");
        this.text = scanner.next();
    }

    @Override
    public String getTextString() {
        return text;
    }    
}
