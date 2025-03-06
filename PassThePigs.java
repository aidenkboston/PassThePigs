import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        final int winningScore = 100; 

        Pigs pig = new Pigs();
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
    }

    public void playGame() {
        System.out.println("Welcome to Pass the Pigs!");
        boolean playing = true;
        players.add(new Human("Aiden"));
        players.add(new GenericBot("GenericBot"));
        for (int i = 0; i < players.size(); i++) {
            scores.add(0);
        }

        while (playing) {
            for (int i = 0; i < players.size(); i++) {
                printBoard(players, scores);
            }
        }
    }

    public void printBoard(ArrayList<Player> players, ArrayList<Integer> score) {
        for (int i = 0; i < players.size(); i++) {
            System.out.print(players.get(i).getName + ": " + scores.get(i) + " |");
        }
    }
}