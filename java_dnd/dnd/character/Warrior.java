package dnd.character;

import dnd.equipment.offensive.OffensiveEquipment;
import dnd.equipment.offensive.Weapon;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior", 10, 5, new Weapon("épée", 2, "épée en acier"));
    }
}
