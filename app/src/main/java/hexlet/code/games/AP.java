package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class AP {
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void playRound() {
        Random random = new Random();

        String[][] round = new String[Engine.ROUNDS][2];
        final int randMinLength = 5;
        final int randMaxLength = 11;
        final int randMaxStartNumb = 20;
        final int randMaxStep = 10;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int lengthOfAp = random.nextInt(randMinLength, randMaxLength);
            int startNumb = random.nextInt(1, randMaxStartNumb);
            int step = random.nextInt(2, randMaxStep);

            int hiddenIndex = random.nextInt(0, lengthOfAp);
            String[] sequenceWithHidden = createSequence(lengthOfAp, startNumb, step);
            round[i][1] = sequenceWithHidden[hiddenIndex];

            sequenceWithHidden[hiddenIndex] = "..";
            round[i][0] = String.join(" ", sequenceWithHidden);
        }
        Engine.play(DESCRIPTION, round);
    }

    private static String[] createSequence(int lengthOfAp, int startNumb, int step) {
        String[] ap = new String[lengthOfAp];
        for (int i = 0; i < lengthOfAp; i++) {
            ap[i] = Integer.toString(startNumb + step * i);
        }
        return ap;
    }
}
