package dnd.character;

import dnd.equipment.OffensiveEquipment;

public class Wizard extends Character {
    /*
    public Wizard(String name) {
        super(name, "Wizard");
    }
*/
    public Wizard(String name) {
         super(name,"Wizard", 6, 8, new OffensiveEquipment("bâton", 2, "sceptre"));
    }

}
