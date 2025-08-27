package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playRound() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[][] round = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(0, 101);

            round[i][0] = Integer.toString(number);
            round[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.play(DESCRIPTION, round);
    }

    private static boolean isPrime(int num) {
        if ((num < 2) || (num % 2 == 0)) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 3; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
