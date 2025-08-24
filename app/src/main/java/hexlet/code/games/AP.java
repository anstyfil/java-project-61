package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class AP {
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void playRound() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[][] round = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int lengthOfAp = random.nextInt(5, 11);
            int startNumb = random.nextInt(1, 20);
            int step = random.nextInt(2, 10);
            int hiddenIndex = random.nextInt(0, lengthOfAp);
            String hiddenElement = createSequence(lengthOfAp, startNumb, step)[hiddenIndex];
            String[] sequenceWithHidden = createSequence(lengthOfAp, startNumb, step);

            sequenceWithHidden[hiddenIndex] = "..";
            round[i][0] = Arrays.toString(sequenceWithHidden);
            round[i][1] = hiddenElement;
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
