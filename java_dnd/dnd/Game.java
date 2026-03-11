package dnd;

import dnd.character.Character;
import dnd.character.Warrior;
import dnd.character.Wizard;

import java.util.Scanner;

public class Game {

    // --- Attributs ---
    private Menu menu;
    private Dice dice;
    private Board board;
    private Character character;
    private Scanner scanner; // Lit les entrées clavier du joueur

    // Constructeur
    public Game(Menu menu, Dice dice, Scanner scanner) {
        this.menu = menu;
        this.dice = dice;
        this.scanner = scanner;
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
            board.print(); // Affiche l'état final du plateau
            System.out.println("You saved the world from the evil Empress");
        }
    }

      //Initialise une nouvelle partie :
    public void initGame(String type, String name) {
        board = new Board(64);      // boardCell() s'exécute ici → board[0] = CellEmpty
        if(type.equals("Warrior")) {
            character = new Warrior(name);
        } else {
            character = new Wizard(name);
        }
        board.setTile(0, character);   // Place visuellement le personnage sur la case 0
        board.setCharacter(character); // Donne au Board une référence au personnage (pour le déplacer)
    }

    // Un tour de jeu :
    public void loop() {
        board.print(); // Affiche le plateau avant le déplacement
        int roll = dice.roll(6);
        board.moveCharacter(roll); // Déplace le personnage du résultat obtenu
        this.scanner.nextLine(); // Pause : attend que le joueur appuie sur Entrée
    }

    //Vérifie si le joueur a gagné.
    public boolean checkWin() {
        return board.getTile(63) == character; // true si le personnage est bien sur la case 63
    }

}
