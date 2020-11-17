/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vashist;

/**
 *
 * @author Leason
 */
public class Fibseq {
    
    public static void poo() {
      int  n1 = 1 ;
int answer = 0 ;
int temp = 0;
while (answer < 100){
   System.out.print(answer) ;
    temp = answer;
    answer = answer + n1;
    n1 = temp ;}
    
    }
    public static void main(String[] args) {
        int n1 = 0 ; 
        int n2 = 1 ; 
        int answer = 0 ; 
        while (answer < 1000000000){
            System.out.print(answer+",");
            answer = n1 + n2 ;
            n1 = n2 ;
            n2 = answer ;
           
          
        }
        
    }

}