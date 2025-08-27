package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void play(String description, String[][] rounds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName);
        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];

            System.out.println("Questions: " + question);
            System.out.println("Your answer: ");
            String userAnswer = sc.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName);
    }
}
