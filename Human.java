import java.util.Scanner;
import java.util.ArrayList;

public class Human extends Player {
    Scanner scan = new Scanner(System.in);
    
    public Human(String n) {
        super(n);
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        String input;
        System.out.println("your score is: " + myScore);
        System.out.println("your hand score is: " + handScore);
        System.out.println("score to win is: " + winningScore);
        System.out.println("Do you want to keep rolling (yes/no): ");
        input = scan.nextLine();

        if (input.equals("no")) {
            return false;
        } else {
            return true;
        }
    }
}