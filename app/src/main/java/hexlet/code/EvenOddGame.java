package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenOddGame {
    public static void playRound() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'";
        String[][] round = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {

            String randomNumb = Integer.toString(random.nextInt(1, 101));
            round[i][0] = randomNumb;
            round[i][1] = isEven(Integer.parseInt(randomNumb)) ? "yes" : "no";
        }
        Engine.play(description, round);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
