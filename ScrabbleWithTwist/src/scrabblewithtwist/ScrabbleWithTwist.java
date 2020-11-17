/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabblewithtwist;

import java.util.Scanner;

/**
 *
 * @author Leason Rykaart
 */
public class ScrabbleWithTwist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instatiating the objects 
        Scanner in = new Scanner(System.in);
        String name1 = " ";
        String name2 = " ";
        Letters arrLetters = new Letters();
        Vowels arrVowels = new Vowels();
        Game user1 = new Game(name1, 0);
        Game user2 = new Game(name2, 0);
        user1.StartCreds();
        int gameStart = in.nextInt();
        in.nextLine();
        //gets the input on wether the use would like to play
        boolean gameCheck;
        if (gameStart == 1) {
            gameCheck = true;
        } else {
            gameCheck = false;
        }

        while (gameCheck == true) {
            System.out.println("*******************************");
            System.out.println("Enter Player 1 Name: ");
//getting input for the users names
            name1 = in.nextLine();
            user1.setName(name1);

            System.out.println("Enter Player 2 Name: ");
            name2 = in.nextLine();
            user2.setName(name2);

            System.out.println("LETS PLAY WORD WARS!!!");
            boolean playerCheck = true;
            while (playerCheck == true) {
                //player 1
                System.out.print("Alphabet Letters Left: ");
                arrLetters.showLetters();
                System.out.println();
                System.out.println(user1.name + " enter Your word: ");
                String word = in.nextLine();
                if ("???".equals(word)) {
                    break;
                }
                word = word.toLowerCase();

                System.out.println("Enter (y) yes if both players agree on the word");
                String yesCheck = in.nextLine();
                if ("y".equals(yesCheck)) {
                    //validality checks on the letters of use
                    user1.score = word.length() + user1.score;
                    for (int i = 0; i < word.length(); i++) {
                        char let = word.charAt(i);
                        for (int j = 0; j < arrLetters.Letters.length; j++) {
                            for (int k = 0; k < arrVowels.Vowels.length; k++) {
                                if (let == arrVowels.Vowels[k]) {
                                    j++;
                                    break;
                                }
                            }
//removing the letters from the array
                            if (let == arrLetters.Letters[j]) {
                                arrLetters.Letters[j] = ' ';
                                break;
                            } else {

                            }
                        }
                    }
                    System.out.println(user1.name + " Score: " + user1.score);

                } else {
                    System.out.println("You enterd a word that Conatins a letter that is used or is not vaild. PLEASE ENTER ANOTHER WORD!");
                }
                //player 2

                System.out.print("Alphabet Letters Left: ");
                arrLetters.showLetters();
                System.out.println();
                System.out.println(user2.name + " enter Your word: ");
                String word2 = in.nextLine();
                if ("???".equals(word)) {
                    break;
                }
                word = word.toLowerCase();

                System.out.println("Enter (y) yes if both players agree on the word");
                String yesCheck2 = in.nextLine();
                if ("y".equals(yesCheck)) {
                    user2.score = word2.length() + user2.score;
                    for (int i = 0; i < word2.length(); i++) {
                        char let = word2.charAt(i);
                        for (int j = 0; j < arrLetters.Letters.length; j++) {
                            for (int k = 0; k < arrVowels.Vowels.length; k++) {
                                if (let == arrVowels.Vowels[k]) {
                                    j++;
                                    break;
                                }
                            }

                            if (let == arrLetters.Letters[j]) {
                                arrLetters.Letters[j] = ' ';
                                break;
                            } else if (let != arrLetters.Letters[j]) {
                                System.out.println("Letters are used");
                                break;
                            }
                        }
                    }
                    System.out.println(user2.name + " Score: " + user2.score);

                } else {
                    System.out.println("You enterd a word that Conatins a letter that is used or is not vaild. PLEASE ENTER ANOTHER WORD!");
                }

            }
            break;
        }//this the method for end game
        user1.EndCreds(user1.score, user2.score, name1, name2);
    }

}
