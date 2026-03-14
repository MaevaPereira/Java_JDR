package dnd;

import dnd.character.Character;
import dnd.character.Warrior;
import dnd.character.Wizard;
import dnd.equipment.offensive.Spell;

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

    public String getType(String name) {
        System.out.println("""
        Choose a class:
        -Wizard 🧙‍♂️
        -Warrior 🥷🏻
        """);
        //return scanner.nextLine();

        String choice = scanner.nextLine(); // on stocke le choix

        if (choice.equals("Wizard")) {
            Wizard player = new Wizard(name);
            System.out.println(player.statsHero());
        } else if (choice.equals("Warrior")) {
            Warrior warrior = new Warrior(name);
            System.out.println(warrior.statsHero());
        }
        return choice;
    }

    public String getName() {
        System.out.println("Enter your name");
        return scanner.nextLine();

    }

}