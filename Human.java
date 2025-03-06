import java.util.Scanner;
import java.util.ArrayList;

public class Human extends Player {
    Scanner scan = new Scanner(System.in);
    
    public Human(String n) {
        super(n);
        strategy = "Natural Intellect";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        String input;
        System.out.print("Your score is: " + myScore + " | ");
        System.out.print("Your hand score is: " + handScore + " | ");
        System.out.println("Points needed to win are: " + (winningScore - myScore) + " | ");
        System.out.println("Do you want to roll (yes/no)");
        input = scan.nextLine();

        if (input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
}