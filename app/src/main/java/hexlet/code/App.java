package hexlet.code;

import hexlet.code.games.EvenOddGame;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter\n0 - Exit\n1 - Greet\n2 - Even");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                break;
            case 1:
                Cli.getByName();
                break;
            case 2:
                EvenOddGame.playRound();
                break;
            default:
                System.out.println("This number doesn't exist here");
                break;
        }
    }
}
