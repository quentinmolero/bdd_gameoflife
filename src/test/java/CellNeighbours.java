import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CellNeighbours {

    List<List<Cell>> grid;
    Board board;
    List<Coordinate> neighbours;
    boolean isBeside;


    @Given("a grid of a horizontal and vertical length of {int}")
    public void aGridOfAHorizontalAndVerticalLengthOf(int length) {
        this.grid = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            List<Cell> row = Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(length).collect(Collectors.toList());
            this.grid.add(row);
        }
        board = new Board(grid, Map.of(CellStatus.ALIVE, "■", CellStatus.DEATH, "."));
    }

    @And("a cell has been living at the coordinate {int},{int}")
    public void aCellHasBeenLivingAtTheCoordinateCellPositionRowCellPositionColumn(int y, int x) {
        grid.get(y).set(x, new Cell(CellStatus.ALIVE));
    }

    @And("a cell is in coordinate {int},{int}")
    public void aCellIsInCoordinateCellPositionRowCellPositionColumn(int y, int x) {
        grid.get(y).set(x, new Cell(CellStatus.ALIVE));
    }

    @When("we check if the cell at coordinate {int},{int} is beside the previous cell")
    public void weCheckIfCellsAreBesides(int x, int y) {
        Coordinate c1 = new Coordinate(2, 2);
        isBeside = c1.isBeside(new Coordinate(y, x));
    }

    @When("we search for neighbours of the cell at coordinate {int},{int}")
    public void weSearchForNeighbours(int y, int x) {
        this.neighbours = this.board.getNeighbours(new Coordinate(y, x));
    }

    @Then("the cell at the coordinate {int},{int} should be neighbour")
    public void theCellAtTheCoordinateCellPositionRowCellPositionColumnShouldBeNeighbour(int y, int x) {
        Assertions.assertThat(this.neighbours).contains(new Coordinate(y, x));
    }

    @Then("the cells should be beside each other")
    public void theCellsShouldBeBesideEachOther() {
        Assertions.assertThat(isBeside).isTrue();
    }

    @Then("the cells shouldn't be beside each other")
    public void theCellsShouldntBeBesideEachOther() {
        Assertions.assertThat(isBeside).isFalse();
    }
}
