package dnd.character;

import dnd.equipment.OffensiveEquipment;

public class Character {

    private String name;
    private String type;
    private int hp;
    private int lvlAttack;
    private OffensiveEquipment offensiveEquipment;

    public Character(String name, String type, int hp, int lvlAttack, OffensiveEquipment offensiveEquipment) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.lvlAttack = lvlAttack;
        this.offensiveEquipment = offensiveEquipment;

    }

    //@Override
    public String toString() {
        return "H";
    }
}
