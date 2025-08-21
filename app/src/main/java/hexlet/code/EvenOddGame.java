package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenOddGame {
    public static void PlayRound() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String userName = Cli.getByName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        int numbOfQuestions = 3;
        for (int i = 0; i < numbOfQuestions; i++) {
            int randomNumb = random.nextInt(1, 101);
            System.out.println("Questions: " + randomNumb);
            System.out.println("Your answer: ");
            String UserAnswer = sc.nextLine();
            String isEven = isEven(randomNumb) ? "yes" : "no";
            if (!UserAnswer.equals(isEven)) {
                System.out.println("'" + UserAnswer + "' is wrong answer ;(. Correct answer is '" + isEven + "'");
                System.out.println("Let's try again, " + userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
