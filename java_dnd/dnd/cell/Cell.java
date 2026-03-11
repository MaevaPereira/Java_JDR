package dnd.cell;

public abstract class Cell {

    private String content;

    public Cell(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

     @Override
    public String toString() { return "O"; }
}

