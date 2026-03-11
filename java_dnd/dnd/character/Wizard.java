package dnd.character;

import dnd.equipment.offensive.OffensiveEquipment;
import dnd.equipment.offensive.Spell;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name, "Wizard", 6, 8, new Spell("bâton", 2, "sceptre"));
    }
}
