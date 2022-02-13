import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Main {

    public static void main(String[] args) {
        List<List<Cell>> blinker = Arrays.asList(
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(5).collect(Collectors.toList()),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH),  new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH),  new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(5).collect(Collectors.toList())
        );
        List<List<Cell>> iColumn = Arrays.asList(
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Arrays.asList(new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.ALIVE), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH), new Cell(CellStatus.DEATH)),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList()),
                Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(11).collect(Collectors.toList())
        );

        BoardHandler boardHandler = BoardHandler.of(blinker);

        for (int period = 0; period < 4; period++) {
            System.out.println("Period #" + period + ":");
            boardHandler.nextPeriod();
        }
    }
}
