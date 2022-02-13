import io.cucumber.java8.En;
import org.assertj.core.api.Assertions;

public class CellSteps implements En {

    public CellSteps(TestContext testContext) {

        Given("a cell has been dead at the position {int},{int}", (Integer x, Integer y) -> {
            testContext.grid.get(x).set(y, false);
        });

        Given("a cell has been living at the position {int},{int}", (Integer x, Integer y) -> {
            testContext.grid.get(x).set(y, true);
        });

        And("the cell at position {int},{int} had {int} living neighbours", (Integer x, Integer y, Integer neighbours) -> {
            int assignedNeighbours = 0;

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (assignedNeighbours < neighbours
                            && !(i == x && j == y)
                            && ((x + i) >= 0 && (x + i) < testContext.grid.size())
                            && ((y + j) >= 0 && (y + j) < testContext.grid.get(x + i).size())
                            && !testContext.grid.get(x + i).get(y + j)) {
                        testContext.grid.get(x + i).set(y + j, true);
                        assignedNeighbours++;
                    }
                }
            }
        });

        When("the next generation is computed", () -> {
            testContext.board = new Board(testContext.grid);
            testContext.grid = testContext.board.live();
        });

        Then("the cell at position {int},{int} should come to life", (Integer x, Integer y) -> {
            Assertions.assertThat(testContext.grid.get(x).get(y)).isTrue();
        });

        Then("the cell at position {int},{int} should survive", (Integer x, Integer y) -> {
            Assertions.assertThat(testContext.grid.get(x).get(y)).isTrue();
        });

        Then("the cell at position {int},{int} should die", (Integer x, Integer y) -> {
            Assertions.assertThat(testContext.grid.get(x).get(y)).isFalse();
        });
    }
}
