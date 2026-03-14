package dnd;

import dnd.cell.*;
import dnd.character.Character;
import dnd.character.Warrior;
import dnd.character.Wizard;
import dnd.exception.OutOfBoardException;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    // Attributs
    private Menu menu;
    private Dice dice;
    private ArrayList<Cell> board;
    private Character character;
    private Scanner scanner; // Lit les entrées clavier du joueur
    private int characterPosition;

    // Constructeur
    public Game(Menu menu, Dice dice, Scanner scanner) {
        this.menu = menu;
        this.dice = dice;
        this.board = new ArrayList<>();
        this.scanner = scanner;
    }

    //mise en place du plateau de jeu
    public void initBoard(int characterPosition, Character character) {
        board.add(new StartCell());
        board.add(new CellEmpty());
        board.add(new CellEnemy());
        board.add(new CellWeapon());
        board.add(new CellPotion());
    }

    public void startGame() {

        //Boucle principale du jeu.
        while (!menu.mainMenu()) {
            String name = menu.getName(); // Récupère le nom saisi par le joueur
            String type = menu.getType(name); // Récupère "Warrior" ou "Wizard"
            initGame(type, name); // Prépare le plateau et crée le personnage
            while (!checkWin()) {
                loop();
            }
            System.out.println("You saved the world from the evil Empress");
        }
    }

    //Initialise une nouvelle partie :
    public void initGame(String type, String name) {
        new ArrayList<>(5);
        if (type.equals("Warrior")) {
            character = new Warrior(name);
        } else {
            character = new Wizard(name);
        }
        initBoard(0, character);   // Place visuellement le personnage sur la case 0
        print(characterPosition);
    }

    //afficher dans la console le contenu de la cellule sur laquelle est le personnage
    public void print(int characterPosition) {
        for (int i = 0; i < board.size(); i++) {
            if (i == characterPosition) {
                System.out.print(character + "" + board.get(i));
            } else {
                System.out.print(board.get(i));
            }
        }
        System.out.println();
    }

//fonction qui fait avancer le personnage
    public void moveCharacter(int move) throws OutOfBoardException {
        characterPosition += move;
        if (characterPosition >= board.size()) {
            throw new OutOfBoardException("Personnage hors plateau"); //lance l'exception
        }
        print(characterPosition);
    }

    // Un tour de jeu :
    public void loop() {
        int roll = dice.roll(40);
        try {
            moveCharacter(roll); // Déplace le personnage du résultat obtenu au dé
        } catch (OutOfBoardException e) {
            System.out.println(e.getMessage()); // 👈 si ça plante, on attrape
            characterPosition = board.size() - 1; // on remet sur la dernière case
        }
        this.scanner.nextLine(); // Pause : attend que le joueur appuie sur Entrée
    }

    //Vérifie si le joueur a gagné.
    public boolean checkWin() {
        return characterPosition >= board.size() -1;
    }
}
