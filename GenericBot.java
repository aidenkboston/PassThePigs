import java.util.ArrayList;

public class GenericBot extends Player {
    public GenericBot(String n) {
        super(n);
        strategy = "Always Roll";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}