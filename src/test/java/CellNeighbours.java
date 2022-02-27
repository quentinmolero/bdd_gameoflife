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

    @And("the coordinate {int},{int} is beside than coordinate {int},{int}")
    public void theCoordinateCellPositionYCellPositionXIsBesideThanCoordinate(int y1, int x1, int y2, int x2) {
        Coordinate c1 = new Coordinate(y1, x1);
        Coordinate c2 = new Coordinate(y2, x2);
        Assertions.assertThat(c1.isBeside(c2)).isTrue();
    }

    @When("we check if the cell at coordinate {int},{int} is beside the cell at coordinate {int},{int}")
    public void weCheckIfCellsAreBesides(int y1, int x1, int y2, int x2) {
        Coordinate c1 = new Coordinate(y1, x1);
        Coordinate c2 = new Coordinate(y2, x2);
        isBeside = c1.isBeside(c2);
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
