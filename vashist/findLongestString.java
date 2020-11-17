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
public class findLongestString {
    public static void main(String[] args) {
        String sen = "I love Steph" ;
        String str = sen ;
    String[] strAr = sen.split(" ");
    int number = strAr[0].length(); 
    int number1 = strAr[1].length() ; 
    int number2 = strAr[2].length() ; 
     int high = 0 ;
     if (number > number1){
         high = number ;
         System.out.print(strAr[0]+" is the highest so far .") ;
     }
     else {
         high = number1 ;
         System.out.print(strAr[1]+" is the highest so far .");
     }
     
     if (high < number2){
         high = number2 ;
         System.out.print(strAr[2]+" is the highest.");
     }
    }
}
