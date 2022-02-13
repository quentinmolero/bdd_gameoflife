import java.util.List;
import java.util.Map;

public class BoardHandler {

    private Board board;

    private BoardHandler(Board board) {
        this.board = board;
    }

    public static BoardHandler of(List<List<Cell>> grid) {
        return new BoardHandler(new Board(grid, Map.of(CellStatus.ALIVE, "■", CellStatus.DEATH, ".")));
    }

    public void nextPeriod() {
        this.board.print();
        this.board = new Board(this.board.live(), Map.of(CellStatus.ALIVE, "■", CellStatus.DEATH, "."));
    }
}
