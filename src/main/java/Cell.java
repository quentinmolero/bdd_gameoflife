import java.util.Map;

public class Cell {
    private final CellStatus cellStatus;
    private final Map<CellStatus, String> displayCell;

    public Cell(CellStatus cellStatus, Map<CellStatus, String> displayCell) {
        this.cellStatus = cellStatus;
        this.displayCell = displayCell;
    }

    @Override
    public String toString() {
        return this.displayCell.get(this.cellStatus);
    }
}
