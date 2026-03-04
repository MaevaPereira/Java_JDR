package dnd.character;

import dnd.equipment.OffensiveEquipment;

public class Character {

    private String name;
    private String type;
    private int hp;
    private int lvlAttack;
    private OffensiveEquipment offensiveEquipment;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //@Override
    public String toString() {
        return "H";
    }
}
