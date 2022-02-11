import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class CellSteps {

    List<List<Boolean>> grid = Arrays.asList(
            Arrays.asList(false, false, false),
            Arrays.asList(false, false, false),
            Arrays.asList(false, false, false));
    Board board;

    @Given("a cell has been dead at the position {int},{int}")
    public void aCellHasBeenDeadAtThePosition(int x, int y) {
        grid.get(x).set(y, false);
    }

    @Given("a cell has been living at the position {int},{int}")
    public void aCellHasBeenLivingAtThePosition(int x, int y) {
        grid.get(x).set(y, true);
    }

    @And("the cell at position {int},{int} had {int} living neighbours")
    public void theCellHadLivingNeighbours(int x, int y, int neighbours) {
        int assignedNeighbours = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (assignedNeighbours < neighbours
                        && !(i == x && j == y)
                        && ((x + i) >= 0 && (x + i) < grid.size())
                        && ((y + j) >= 0 && (y + j) < grid.get(x + i).size())
                        && !grid.get(x + i).get(y + j)) {
                    grid.get(x + i).set(y + j, true);
                    assignedNeighbours++;
                }
            }
        }
    }

    @When("the next generation is computed")
    public void theNextGenerationIsComputed() {
        board = new Board(grid);
        grid = board.live();
    }

    @Then("the cell at position {int},{int} should come to life")
    public void theCellShouldComeToLife(int x, int y) {
        Assertions.assertThat(grid.get(x).get(y)).isTrue();
    }

    @Then("the cell at position {int},{int} should survive")
    public void theCellShouldSurvive(int x, int y) {
        Assertions.assertThat(grid.get(x).get(y)).isTrue();
    }

    @Then("the cell at position {int},{int} should die")
    public void theCellShouldDie(int x, int y) {
        Assertions.assertThat(grid.get(x).get(y)).isFalse();
    }
}
