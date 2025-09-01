package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public final class AP {
    private AP() {

    }
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void playRound() {
        String[][] round = new String[Engine.ROUNDS][2];
        final int randMinLength = 5;
        final int randMaxLength = 11;
        final int randMaxStartNumb = 20;
        final int randMaxStep = 10;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int lengthOfAp = Utils.generateNumber(randMinLength, randMaxLength);
            int startNumb = Utils.generateNumber(1, randMaxStartNumb);
            int step = Utils.generateNumber(2, randMaxStep);

            int hiddenIndex = Utils.generateNumber(0, lengthOfAp);
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
