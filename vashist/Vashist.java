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
public class Vashist {
int guess = 0 ;


public static int getNum (){
    int num = Integer.parseInt(JOptionPane.showInputDialog("enter number between 1 and 10")) ; 
   return num ; 
}

public static int ranNum() {
   int ran = (int) (Math.random()*10) ;
   
    return ran ; 
}

public static int numlow() {
   int num = Integer.parseInt(JOptionPane.showInputDialog("num to low ")) ; 
   
    return num; 
}
public static int numhigh() {
   int num = Integer.parseInt(JOptionPane.showInputDialog("num to high ")) ; 
   
    return num; 
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num = getNum();
    int ran = ranNum() ;
    
        System.out.println(ran);
        while (num != ran) {            
          if (num > ran){
              
              num = numhigh() ;
          }
          
          if (num < ran){
            num =  numlow() ; 
          }
               
    }
         System.out.println("Welldone you got random: " + ran );
    }
        }
    
   
     
     
    
    

