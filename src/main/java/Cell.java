import java.util.Map;

public class Cell {
    private final CellStatus cellStatus;

    public Cell(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }
}
