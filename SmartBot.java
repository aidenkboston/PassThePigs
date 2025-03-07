import java.util.ArrayList;

public class SmartBot extends Player {
    public SmartBot(String n) {
        super(n);
        strategy = "Try to get over 20 points and take risks if necessary";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        int findMax = 0;
        for (int num: otherScores) {
            if (num > findMax) {
                findMax = num;
            }
        }
        if (handScore < 20) {
            return true;
        } else if (myScore + handScore < findMax - 20) {
            return true;        
        } else {
            return false;
        }
    }
}