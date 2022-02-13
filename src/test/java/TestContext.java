import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestContext {
    List<List<Cell>> grid = Arrays.asList(
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList()),
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList()),
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList())
    );
    Board board;
}
