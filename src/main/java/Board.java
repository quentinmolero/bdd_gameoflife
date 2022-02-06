import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<List<Boolean>> grid;

    public Board(List<List<Boolean>> grid) {
        this.grid = grid;
    }

    public void print() {
        for (List<Boolean> row : grid) {
            for (Boolean cell : row) {
                System.out.print(cell ? " ■" : " .");
            }
            System.out.println(" ");
        }
    }

    public List<List<Boolean>> live() {
        List<List<Boolean>> newGrid = new ArrayList<>();

        for (int x = 0; x < grid.size(); x++) {
            List<Boolean> row = new ArrayList<>();

            for (int y = 0; y < grid.get(x).size(); y++) {
                int neighbours = getNeighbours(x, y);

                row.add(getNewCellState(grid.get(x).get(y), neighbours));
            }

            newGrid.add(row);
        }

        return newGrid;
    }

    private int getNeighbours(int x, int y) {
        int neighbours = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!(i == 0 && j == 0)
                        && ((x + i) >= 0 && (x + i) < grid.size())
                        && ((y + j) >= 0 && (y + j) < grid.get(x + i).size())
                        && grid.get(x + i).get(y + j)) {
                    neighbours += 1;
                }
            }
        }

        return neighbours;
    }

    private Boolean getNewCellState(Boolean cell, int neighbours) {
        Boolean newCell = cell;

        if (cell && neighbours < 2) {
            newCell = false;
        } else if (cell && neighbours > 3) {
            newCell = false;
        } else if (!cell && neighbours == 3) {
            newCell = true;
        }

        return newCell;
    }
}
