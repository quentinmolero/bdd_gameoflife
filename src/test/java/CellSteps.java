import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CellSteps {
    List<List<Cell>> grid = Arrays.asList(
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList()),
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList()),
            Stream.generate(() -> new Cell(CellStatus.DEATH)).limit(3).collect(Collectors.toList())
    );
    Board board;

    int cellExamplePositionX = 1;
    int cellExamplePositionY = 1;


    @Given("a cell has been living")
    public void aCellHasBeenLiving() {
        grid.get(cellExamplePositionY).set(cellExamplePositionX, new Cell(CellStatus.ALIVE));
    }

    @Given("a cell has been dead")
    public void aCellHasBeenDead() {
        grid.get(cellExamplePositionY).set(cellExamplePositionX, new Cell(CellStatus.DEATH));
    }


    @And("the cell had {int} living neighbours")
    public void theCellHadCellPositionRowLivingNeighbours(int neighbours) {

        int assignedNeighbours = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (assignedNeighbours < neighbours
                        && !(i == cellExamplePositionX && j == cellExamplePositionY)
                        && ((cellExamplePositionY + i) >= 0 && (cellExamplePositionX + i) < this.grid.size())
                        && ((cellExamplePositionY + j) >= 0 && (cellExamplePositionY + j) < this.grid.get(cellExamplePositionX + i).size())
                        && !this.grid.get(cellExamplePositionX + i).get(cellExamplePositionY + j).getCellStatus().equals(CellStatus.ALIVE)) {
                    this.grid.get(cellExamplePositionX + i).set(cellExamplePositionY + j, new Cell(CellStatus.ALIVE));
                    assignedNeighbours++;
                }
            }
        }

    }

    @When("the next generation is computed")
    public void theNextGenerationIsComputed() {
        board = new Board(grid, Map.of(CellStatus.ALIVE, "■", CellStatus.DEATH, "."));
        grid = board.live();
    }

    @Then("the cell should die")
    public void theCellShouldDie() {
        Assertions.assertThat(grid.get(cellExamplePositionY).get(cellExamplePositionX).getCellStatus().equals(CellStatus.DEATH)).isTrue();
    }


    @Then("the cell should survive")
    public void theCellShouldSurvive() {
        Assertions.assertThat(grid.get(cellExamplePositionY).get(cellExamplePositionX).getCellStatus().equals(CellStatus.ALIVE)).isTrue();
    }

    @Then("the cell should come to life")
    public void theCellShouldComeToLife() {
        Assertions.assertThat(grid.get(cellExamplePositionY).get(cellExamplePositionX).getCellStatus().equals(CellStatus.ALIVE)).isTrue();
    }
}
