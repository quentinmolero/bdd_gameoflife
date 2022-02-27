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

    @Given("a cell has been living")
    public void aCellHasBeenLiving() {
        grid.get(1).set(1, new Cell(CellStatus.ALIVE));
    }

    @Given("a cell has been dead")
    public void aCellHasBeenDead() {
        grid.get(1).set(1, new Cell(CellStatus.DEATH));
    }


    @And("the cell had {int} living neighbours")
    public void theCellHadCellPositionRowLivingNeighbours(int neighbours) {
        int cellLivingX = 1;
        int cellLivingY = 1;
        int assignedNeighbours = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (assignedNeighbours < neighbours
                        && (i != cellLivingX || j != cellLivingY)
                        && (0 <= (cellLivingX + i) && (cellLivingX + i) < this.grid.size())
                        && (0 <= (cellLivingY + j) && (cellLivingY + j) < this.grid.get(cellLivingX + i).size())
                        && !this.grid.get(cellLivingX + i).get(cellLivingY + j).getCellStatus().equals(CellStatus.ALIVE)
                ) {
                    this.grid.get(cellLivingX + i).set(cellLivingY + j, new Cell(CellStatus.ALIVE));
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
        Assertions.assertThat(grid.get(1).get(1).getCellStatus().equals(CellStatus.DEATH)).isTrue();
    }


    @Then("the cell should survive")
    public void theCellShouldSurvive() {
    }

    @Then("the cell should come to life")
    public void theCellShouldComeToLife() {
        Assertions.assertThat(grid.get(1).get(1).getCellStatus().equals(CellStatus.ALIVE)).isTrue();
    }
}
