package dnd.equipment;

public abstract class Equipment {

    private String type;
    private int level;
    private String name;


    public Equipment(String type, int level, String name) {
        this.level = level;
        this.type = type;
        this.name = name;
    }

    public String statsEquipment() {
        return System.lineSeparator()
                +" Lvl: "+ level +System.lineSeparator()
                +" Type: "+ type +System.lineSeparator()
                +" Name: "+ name +System.lineSeparator();
    }
    @Override
    public String toString() {return statsEquipment();}
}