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
public class dice {
    
    int[] dice = {1,2,3,4,5,6} ;
   
    public static int getDice(){
     int ran = (int) (Math.random()* 5+1) ;
        return ran;  
    }
    
    public static void main(String[] args) {
         int[] DResualt = {} ;
      int ran =  getDice();
        System.out.println(ran);
        for (int i = 0; i < 5; i++) {
             DResualt[i] = DResualt[ran] ; 
             System.out.println(ran);
        }
     
    }
}
