package dnd.character;
import dnd.equipment.offensive.OffensiveEquipment;

public abstract class Character {

    private String name;
    private String type;
    private int hp;
    private int lvlAttack;
    private OffensiveEquipment offensiveEquipment;

    // Constructeur
    public Character(String name, String type, int hp, int lvlAttack, OffensiveEquipment offensiveEquipment) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.lvlAttack = lvlAttack;
        this.offensiveEquipment = offensiveEquipment;
    }

    // Retourne un résumé formaté des statistiques du personnage
    public String statsHero() {
        return " Name: "+ name +System.lineSeparator()
                +" Class: "+ type +System.lineSeparator()
                +" Hp: "+ hp +System.lineSeparator()
                +" Attack: "+ lvlAttack +System.lineSeparator()
                +System.lineSeparator()
                +" Equipment: "+ offensiveEquipment;
    }

    @Override
    public String toString() {return "\uD83E\uDDD9\u200D♂\uFE0F";}
}