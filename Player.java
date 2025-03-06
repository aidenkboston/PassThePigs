import java.util.ArrayList;

public class Player {
    private String name;
    public String strategy;

    public Player(String n) {
        name = n; 
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy;
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }    
}