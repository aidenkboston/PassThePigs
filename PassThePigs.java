import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        final int winningScore = 100; 
        Pigs pig = new Pigs();
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Welcome to Pass the Pigs!");
        boolean playing = true;
        players.add(new Human("Aiden"));
        players.add(new GenericBot("GenericBot"));
        players.add(new RandomBot("RandomBot"));
        for (int i = 0; i < players.size(); i++) {
            scores.add(0);
        }

        while (playing) {
            for (int i = 0; i < players.size(); i++) {
                printBoard(players, scores);
                int handScore = 0;
                while ((players.get(i)).wantsToRoll(scores.get(i), handScore, scores, winningScore)) {
                    int rolledPoints = pig.addScore(); 
                    handScore += rolledPoints;
                    if (rolledPoints == 0) {
                        System.out.println(players.get(i).getName() + " rolls a " + pig.getPig1() + " and a " + pig.getPig2() + " for a roll of " + rolledPoints + ". That's a PIG OUT!");
                        handScore = 0;
                        break;
                    } else {
                        System.out.println(players.get(i).getName() + " rolls a " + pig.getPig1() + " and a " + pig.getPig2() + " for a roll of " + rolledPoints + ". Handscore is now: " + handScore); 
                    }
                }
                System.out.println(players.get(i).getName() + " pigs out or passes.");
                scores.set(i, scores.get(i) + handScore);

                if (scores.get(i) >= winningScore) {
                    System.out.println(players.get(i).getName() + " has won! They used strategy: " + players.get(i).getStrategy());
                    playing = false;
                    return;
                }
            }
        }
    }

    public static void printBoard(ArrayList<Player> players, ArrayList<Integer> scores) {
        for (int i = 0; i < players.size(); i++) {
            System.out.print(players.get(i).getName() + ": " + scores.get(i) + " | ");
        }
        System.out.println();
    }
}