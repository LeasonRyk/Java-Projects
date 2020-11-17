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
public class Game {
//naming Strings
    public String name;
    public int score;
//getter and setter methods WITh constructor
    
    public Game(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
//method for the intro
    public void StartCreds() {
        System.out.println("Welcome to the WORD WARS Game");
        System.out.println();
        System.out.println("Press (1) To start the game.");
        System.out.println();
        System.out.println("Press any other key to exit game");
        System.out.println("Enter your Selection: ");
    }
//method for a random user to start
    public int randomstart() {
        int choice = (int) (Math.random() * 2);
        return choice;
    }
//method for the end 
    public void EndCreds(int score1, int score2, String name1, String name2) {
        if (score1 > score2) {
            System.out.println(name1 + " won the game with " + score1 + " points");
        } else if (score1 == score2) {
            System.out.println("DRAW");
        } else {
            System.out.println(name2 + " won the game with " + score2 + " points");
        }
    }

}
