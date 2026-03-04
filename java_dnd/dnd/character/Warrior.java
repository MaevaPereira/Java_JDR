package dnd.character;

import dnd.equipment.OffensiveEquipment;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name,"Warrior", 6, 8, new OffensiveEquipment("bâton", 2, "sceptre"));
    }

}
