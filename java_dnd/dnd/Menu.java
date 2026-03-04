package dnd;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    // Retourne vrai si l'utilisateur demande à quitter le jeu
    public boolean mainMenu() {
        System.out.println("""
                Make a choice:
                1: New hero
                2: Edit character
                3: Exit
                """);

        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                return false;
            case 2:
                System.out.println("section not done yet");
                return mainMenu();
            case 3:
                return true;
            default:
                System.out.println("Try again");
                return mainMenu();
        }
    }

    public String getType() {
        System.out.println("""
        Choose a class:
        -Wizard
        -Warrior
        """);
        return scanner.nextLine();
    }

    public String getName() {
        System.out.println("Enter your name");
        return scanner.nextLine();
    }
}
