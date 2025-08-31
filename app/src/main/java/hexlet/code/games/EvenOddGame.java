package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class EvenOddGame {
    private EvenOddGame() {

    }
    public static void playRound() {
        Random random = new Random();
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] round = new String[Engine.ROUNDS][2];
        final int randMax = 1000;
        for (int i = 0; i < Engine.ROUNDS; i++) {

            String randomNumb = Integer.toString(random.nextInt(1, randMax));
            round[i][0] = randomNumb;
            round[i][1] = isEven(Integer.parseInt(randomNumb)) ? "yes" : "no";
        }
        Engine.play(description, round);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
