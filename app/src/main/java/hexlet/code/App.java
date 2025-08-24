package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenOddGame;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = sc.nextInt(); //Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                break;
            case 1:
                Cli.getByName();
                break;
            case 2:
                EvenOddGame.playRound();
                break;
            case 3:
                Calc.playRound();
                break;
            default:
                System.out.println("This number doesn't exist here");
                break;
        }
    }
}
