import java.util.ArrayList;

public class GenericBot extends Player {
    public GenericBot(String n) {
        super(n);
        super.strategy = "Roll Twice";
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return super.strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}