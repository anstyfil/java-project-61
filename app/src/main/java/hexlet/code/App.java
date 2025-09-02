package hexlet.code;

import hexlet.code.games.EvenOddGame;
import hexlet.code.games.AP;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumbers;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int choiceExit = 0;
        final int choiceGreet = 1;
        final int choiceEven = 2;
        final int choiceCalc = 3;
        final int choiceGCD = 4;
        final int choiceAP = 5;
        final int choicePrime = 6;
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n4 - GCD\n5 - AP\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");

        int userChoice = Integer.parseInt(sc.nextLine());
        switch (userChoice) {
            case choiceExit:
                break;
            case choiceGreet:
                Engine.greeting(sc);
                break;
            case choiceEven:
                EvenOddGame.playRound();
                break;
            case choiceCalc:
                Calc.playRound();
                break;
            case choiceGCD:
                GCD.playRound();
                break;
            case choiceAP:
                AP.playRound();
                break;
            case choicePrime:
                PrimeNumbers.playRound();
                break;
            default:
                System.out.println(userChoice + " - doesn't exist here.\n");
                break;
        }
    }
}
