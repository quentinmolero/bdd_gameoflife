import io.cucumber.java8.En;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CellNeighbours implements En {

    List<List<Cell>> grid;
    Board board;
    List<Coordinate> neighbours;

    public CellNeighbours() {
        Given("a grid of a horizontal and vertical length of {int}", (Integer length) -> {
            this.grid = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                List<Cell> row = Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(length).collect(Collectors.toList());
                this.grid.add(row);
            }
            board = new Board(grid, Map.of(CellStatus.ALIVE, "■", CellStatus.DEATH, "."));
        });

        And("a cell has been living at the coordinate {int},{int}", (Integer y, Integer x) -> {
            grid.get(y).set(x, new Cell(CellStatus.ALIVE));
        });

        When("we search for neighbours of the cell at coordinate {int},{int}", (Integer y, Integer x) -> {
            this.neighbours = this.board.getNeighbours(new Coordinate(y, x));
        });

        Then("the cell at the coordinate {int},{int} should be neighbour", (Integer y, Integer x) -> {
            Assertions.assertThat(this.neighbours).contains(new Coordinate(y, x));
        });
    }
}
