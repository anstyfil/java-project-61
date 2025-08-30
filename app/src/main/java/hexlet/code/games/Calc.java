package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final String DESCRPTION = "What is the result of the expression?";

    public static void playRound() {
        Random random = new Random();

        String[][] round = new String[Engine.ROUNDS][2];
        final int randMax = 1000;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumb = random.nextInt(1, randMax);
            int secondNumb = random.nextInt(1, randMax);
            char[] operations = {'+', '-', '*'};
            char op = operations[random.nextInt(0, operations.length - 1)];

            int result = 0;
            switch (op) {
                case '+':
                    result = firstNumb + secondNumb;
                    break;
                case '-':
                    result = firstNumb - secondNumb;
                    break;
                default:
                    result = firstNumb * secondNumb;
                    break;
            }
            round[i][0] = firstNumb + " " + op + " " + secondNumb;
            round[i][1] = Integer.toString(result);
        }
        Engine.play(DESCRPTION, round);
    }
}
