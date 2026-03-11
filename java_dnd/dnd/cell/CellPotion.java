package dnd.cell;

public class CellPotion extends dnd.cell.Cell {
    public CellPotion(String content)
    {
        super("potion found");
    }


    @Override
    public String toString() {return "potion found";}

}
