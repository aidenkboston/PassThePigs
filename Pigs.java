public class Pigs {
    private String pig1;
    private String pig2;

    public String rollPig() { // uses the probability of each roll adding up to get the appropriate roll
        double probability = Math.random() * 100;

        if (probability <= .7) {
            return "Jowler";
        } else if (probability <= .7 + 3)  {
            return "Snouter";
        } else if (probability <= .7 + 3 + 8.8) {
            return "Trotter";
        } else if (probability <= .7 + 3 + 8.8 + 22.4) {
            return "Razorback";
        } else if (probability <= .7 + 3 + 8.8 + 22.4 + 30.2) {
            return "No Dot";
        } else {
            return "Dot";
        }
    }

    public int addScore() { //casts doublt to int for to allow for correct logic when rolling only one "Dot" or "No Dot"
        double score = 0;
        String pig1 = rollPig();
        String pig2 = rollPig();
        String[] pigsArr = {pig1, pig2}; 

        if ((pig1.equals("No Dot") && pig2.equals("Dot")) || (pig2.equals("No Dot") && pig1.equals("Dot"))) {
            return (int)score;
        } 

        for (int i = 0; i < pigsArr.length; i++) {
            if (pigsArr[i].equals("Jowler")) {
                score += 15;
            } else if (pigsArr[i].equals("Snouter"))  {
                score += 10;
            } else if (pigsArr[i].equals("Trotter")) {
                score += 5;
            } else if (pigsArr[i].equals("Razorback")) {
                score += 5;
            } else if (pigsArr[i].equals("No Dot")) {
                score += .25;
            } else {
                score += .25;
            }
        }

        if (pig1.equals(pig2)) {
            score = score * 2;
        }
        
        return (int)score;
    }

    public String getPig1() {
        return pig1;
    }

    public String getPig2() {
        return pig2;
    }
}