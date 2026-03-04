package dnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Player");
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(new Menu(scanner), new Dice(), scanner);
        game.startGame();
    }
}
