/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studying;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Leason Rykaart
 */
public class Tristain {

    public static String critMath(double critChance) {
        String applyCrit = "";
        double rand = Math.random() * 100;
        System.out.println(rand);
        if (rand <= critChance) {
            applyCrit = "Crit";
        } else {
            applyCrit = "NO Crit";
        }
        return applyCrit;
    }

    public static void main(String[] args) {
        double critChance = 0;
        int getCrit;
        
        getCrit = Integer.parseInt(JOptionPane.showInputDialog("Buy item for Crit: " + "\n" + "1: Infinty edge: 50%" + "\n" + "2: Static Shiv : 30%" + "\n" + "3: Blood thersiter: 0%"));
        while(true){
        int click = Integer.parseInt(JOptionPane.showInputDialog("1 for click" + "\n" + "0 for no click"));
        if (click == 1) {
            switch (getCrit) {
                case 1:
                    critChance = 50;
                    break;
                case 2:
                    critChance = 30;
                    break;
                case 3:
                    critChance = 0;
                    break;

                default:
                    System.out.println("Value Invalid");
            }
            System.out.println(critMath(critChance));
        } else {
            System.out.println("no click was atteempted so code doesnt run");
        }
        }

    }
}
