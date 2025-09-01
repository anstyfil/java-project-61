package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public final class Calc {
    private Calc() {

    }
    static final String DESCRPTION = "What is the result of the expression?";

    public static void playRound() {
        String[][] round = new String[Engine.ROUNDS][2];
        final int randMax = 1000;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumb = Utils.generateNumber(1, randMax);
            int secondNumb = Utils.generateNumber(1, randMax);
            char[] operations = {'+', '-', '*'};
            char op = operations[Utils.generateNumber(0, operations.length - 1)];

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
