import java.util.ArrayList;

public class RandomBot extends Player {
    public RandomBot(String n) {
        super(n);
        strategy = "50/50 Chance to Roll";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        double randRoll = Math.random();
        if (randRoll < .5) {
            return true;
        }
        return false;
    }
}
