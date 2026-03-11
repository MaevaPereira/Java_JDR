package dnd;

import dnd.cell.*;
import java.util.ArrayList;
import dnd.character.Character; // ← ajoute cet import

public class Board {

    private Object[] board;
    private int characterPosition;
    private Character character;

    public Board(int size) {
        board = new Object[size];
        boardCell();
    }

    public Object getTile(int pos) {
        return board[pos];
    }

    public void setTile(int pos, Object tile) {
        board[pos] = tile;
    }

    public void moveCharacter(int move) {
        setTile(characterPosition, null);
        characterPosition += move;
        if (characterPosition >= board.length) {
            characterPosition = board.length - 1;
        }

        setTile(characterPosition, character);// pose le personnage
    }
    public void setCharacter(Character character) { // ← ajoute cette méthode dans Board
        this.character = character;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            if(board[i] == null) {
                System.out.print(".");
            } else {
                System.out.print(board[i]);
            }
        }
        System.out.println();
    }

    //tableau
    public void boardCell() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(0, new CellEmpty("empty cell"));
        cells.add(1, new CellEmpty("empty cell"));
        cells.add(2, new CellEnemy("enemy"));
        cells.add(3, new CellWeapon("weapon"));
        cells.add(4, new CellPotion("potion"));
        cells.add(5, new CellEmpty("empty cell"));
        cells.add(6, new CellEmpty("empty cell"));
        cells.add(7, new CellEnemy("enemy"));
        cells.add(8, new CellWeapon("empty cell"));
        cells.add(9, new CellPotion("empty cell"));
        cells.add(10, new CellEmpty("empty cell"));
        cells.add(11, new CellEmpty("empty cell"));
        cells.add(12, new CellEnemy("enemy"));
        cells.add(13, new CellWeapon("empty cell"));
        cells.add(14, new CellPotion("potion"));
        cells.add(15, new CellEmpty("empty cell"));
        cells.add(16, new CellEmpty("empty cell"));
        cells.add(17, new CellEnemy("enemy"));
        cells.add(18, new CellWeapon("empty cell"));
        cells.add(19, new CellPotion("potion"));
        cells.add(20, new CellEmpty("empty cell"));
        cells.add(21, new CellEmpty("empty cell"));
        cells.add(22, new CellEnemy("enemy"));
        cells.add(23, new CellWeapon("weapon"));
        cells.add(24, new CellPotion("potion"));
        cells.add(25, new CellEmpty("empty cell"));
        cells.add(26, new CellEmpty("empty cell"));
        cells.add(27, new CellEnemy("empty cell"));
        cells.add(28, new CellWeapon("empty cell"));
        cells.add(29, new CellPotion("empty cell"));
        cells.add(30, new CellEmpty("empty cell"));
        cells.add(31, new CellEmpty("empty cell"));
        cells.add(32, new CellEnemy("enemy"));
        cells.add(33, new CellWeapon("empty cell"));
        cells.add(34, new CellPotion("empty cell"));
        cells.add(35, new CellEmpty("empty cell"));
        cells.add(36, new CellEmpty("empty cell"));
        cells.add(37, new CellEnemy("enemy"));
        cells.add(38, new CellWeapon("empty cell"));
        cells.add(39, new CellPotion("empty cell"));
        cells.add(40, new CellEmpty("empty cell"));
        cells.add(41, new CellEmpty("empty cell"));
        cells.add(42, new CellEnemy("enemy"));
        cells.add(43, new CellWeapon("weapon"));
        cells.add(44, new CellPotion("potion"));
        cells.add(45, new CellEmpty("empty cell"));
        cells.add(46, new CellEmpty("empty cell"));
        cells.add(47, new CellEnemy("empty cell"));
        cells.add(48, new CellWeapon("empty cell"));
        cells.add(49, new CellPotion("empty cell"));
        cells.add(50, new CellEmpty("empty cell"));
        cells.add(51, new CellEmpty("empty cell"));
        cells.add(52, new CellEnemy("enemy"));
        cells.add(53, new CellWeapon("weapon"));
        cells.add(54, new CellPotion("potion"));
        cells.add(55, new CellEmpty("empty cell"));
        cells.add(56, new CellEmpty("empty cell"));
        cells.add(57, new CellEnemy("empty cell"));
        cells.add(58, new CellWeapon("empty cell"));
        cells.add(59, new CellPotion("empty cell"));
        cells.add(60, new CellEmpty("empty cell"));
        cells.add(61, new CellEmpty("empty cell"));
        cells.add(62, new CellEnemy("enemy"));
        cells.add(63, new CellWeapon(""));


        for (int i = 0; i < cells.size(); i++) {
            board[i] = cells.get(i);
        }
    }
}
