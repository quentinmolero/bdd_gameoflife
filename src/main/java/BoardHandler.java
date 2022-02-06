import java.util.List;

public class BoardHandler {

    private Board board;

    private BoardHandler(Board board) {
        this.board = board;
    }

    public static BoardHandler of(List<List<Boolean>> grid) {
        return new BoardHandler(new Board(grid));
    }

    public void nextPeriod() {
        this.board.print();
        this.board = new Board(this.board.live());
    }
}
