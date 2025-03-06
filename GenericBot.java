import java.util.ArrayList;

public class GenericBot extends Player {
    int numRolls = 0;
    public GenericBot(String n) {
        super(n);
        //super.strategy = "Roll Twice";
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return "strategy";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (!(numRolls < 2)) {
            return false;
        } 
        numRolls++;
        return true;
    }
}