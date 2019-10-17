package edu.cscc;
import java.util.*;

/**
 * Rock, Paper, Scissors, Lizard, Spock Main Class
 * @author Mladen Babaleev
 * @version 1.0
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;
        /**
         * @param h_pick what the user played (rock, paper, scissors, lizard, spock)
         * @param c_pick what the computer played (rock, paper, scissors, lizard, spock)
         * @param answer whether the user wants to play again or not
         * @param isValid checks the user input to see if its valid
         */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
                /**
                 * Prompts the user to make a selection and captures the selection under h_pick.
                 * @param isValid calls to RPSLSpock class method "isValidPick" to check input
                 * If invalid, let user know.
                 */

            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");
            /**
             * @param c_pick holds the value of what the computer picks (rock, paper, scissors, lizard, spock
             *               by calling class method generatePick in RPSLSpock.
             */

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            /**
             * This method will compare the value of c_pick and h_pick to see who has won and let the user know.
             * If equal values, tie. If the computer wins, computerWin method is used in RPSLSpock. Else, user wins.
             */

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
        /**
         * @param answer holds the input from the user
         * If the user says "y", game continues. If the user says "n", game will stop and output a goodbye message.
         */
    }
}