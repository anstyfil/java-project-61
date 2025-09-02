package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public final class PrimeNumbers {
    private PrimeNumbers() {

    }
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playRound() {
        String[][] round = new String[Engine.ROUNDS][2];
        final int randMax = 100;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(0, randMax);

            round[i][0] = Integer.toString(number);
            round[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.play(DESCRIPTION, round);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        final int firstOddDivisor = 3;
        for (int i = firstOddDivisor; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
