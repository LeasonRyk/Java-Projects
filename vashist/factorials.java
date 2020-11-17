/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vashist;

import javax.swing.JOptionPane;

/**
 *
 * @author Leason
 */
public class factorials {
    
    public static int getNum(int Num){
        int total = 1 ; 
       
        while (Num > 0){
           total = total * Num ;
           Num--;
            
        }
        System.out.println(total);
        return total;
        
    }
    public static void main(String[] args) {
     getNum(Integer.parseInt(JOptionPane.showInputDialog("enter a number "))) ; 
     
    }
}
