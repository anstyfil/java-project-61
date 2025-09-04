package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() {

    }
    public static final int ROUNDS = 3;
    public static void play(String description, String[][] rounds) {
        Scanner sc = new Scanner(System.in);
        String userName = greeting(sc);
        System.out.println(description);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine().toLowerCase();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static String greeting(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
