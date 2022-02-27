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

    @And("a cell {string} at the coordinate {int},{int}")
    public void aCellHasBeenLivingAtTheCoordinateCellPositionRowCellPositionColumn(String hasBeenLiving ,int y, int x) {
        if(hasBeenLiving.equals("has been living")) {
            grid.get(y).set(x, new Cell(CellStatus.ALIVE));
        }else {
            grid.get(y).set(x, new Cell(CellStatus.DEATH));
        }
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

    @And("the coordinate {int},{int} {string} than coordinate {int},{int}")
    public void theCoordinateCellPositionYCellPositionXIsBesideThanCoordinate(int y1, int x1, String isBeside, int y2, int x2 ) {
        Coordinate c1 = new Coordinate(y1, x1);
        Coordinate c2 = new Coordinate(y2, x2);
        if(isBeside.equals("is beside")) {
            Assertions.assertThat(c1.isBeside(c2)).isTrue();
        }else {
            Assertions.assertThat(c1.isBeside(c2)).isFalse();
        }
    }

    @When("we check if the cell at coordinate {int},{int} is beside the cell at coordinate {int},{int}")
    public void weCheckIfCellsAreBesides(int y1, int x1, int y2, int x2) {
        Coordinate c1 = new Coordinate(y1, x1);
        Coordinate c2 = new Coordinate(y2, x2);
        isBeside = c1.isBeside(c2) && c2.isBeside(c1);
    }

    @When("we search for neighbours of the cell at coordinate {int},{int}")
    public void weSearchForNeighbours(int y, int x) {
        this.neighbours = this.board.getNeighbours(new Coordinate(y, x));
    }

    @Then("the cell at the coordinate {int},{int} should be neighbour")
    public void theCellAtTheCoordinateCellPositionRowCellPositionColumnShouldBeNeighbour(int y, int x) {
        Assertions.assertThat(this.neighbours).contains(new Coordinate(y, x));
    }

    @Then("the cell at the coordinate {int},{int} should {string}")
    public void theCellAtTheCoordinateCellPositionYCellPositionXShouldBeNeighbour(int y, int x, String isNeighbour) {
        if(isNeighbour.equals("be neighbour")) {
            Assertions.assertThat(this.neighbours).contains(new Coordinate(y, x));
        }else {
            Assertions.assertThat(this.neighbours).doesNotContain(new Coordinate(y, x));
        }
    }

    @Then("the cells should {string} each other")
    public void theCellsShouldBeBesideEachOther(String beBeside) {
        if(beBeside.equals("be beside")) {
            Assertions.assertThat(isBeside).isTrue();
        }else {
            Assertions.assertThat(isBeside).isFalse();
        }

    }

    @Then("the cells shouldn't be beside each other")
    public void theCellsShouldntBeBesideEachOther() {
        Assertions.assertThat(isBeside).isFalse();
    }

}
