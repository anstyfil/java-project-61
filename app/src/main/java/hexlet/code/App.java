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
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n4 - GCD\n5 - AP\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                break;
            case 1:
                Engine.greeting(sc);
                break;
            case 2:
                EvenOddGame.playRound();
                break;
            case 3:
                Calc.playRound();
                break;
            case 4:
                GCD.playRound();
                break;
            case 5:
                AP.playRound();
                break;
            case 6:
                PrimeNumbers.playRound();
                break;
            default:
                System.out.println("This number doesn't exist here");
                break;
        }
    }
}
