package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playRound() {
        Random random = new Random();

        String[][] round = new String[Engine.ROUNDS][2];
        int gcd = 0;
        final int randMax = 1000;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumb = random.nextInt(1, randMax);
            int secondNumb = random.nextInt(1, randMax);
            round[i][0] = firstNumb + " " + secondNumb;
            if (secondNumb == 0) {
                gcd = firstNumb;
            } else {
                while (secondNumb != 0) {
                    gcd = secondNumb;
                    secondNumb = firstNumb % secondNumb;
                    firstNumb = gcd;
                }
            }
            round[i][1] = Integer.toString(gcd);
        }
        Engine.play(DESCRIPTION, round);
    }
}
