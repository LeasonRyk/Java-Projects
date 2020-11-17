/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabblewithtwist;

/**
 *
 * @author Leason Rykaart
 */
public class Letters {
    //this the class for the letters
    public char[] Letters = {'a','b','c','d','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'} ; 
    

    public Letters() {
    }
    
    public void showLetters(){
        for (int i = 0; i < Letters.length; i++) {
            System.out.print(Letters[i]+" ");
            
        }
        System.out.println();
    }
    
}
