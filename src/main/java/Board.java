import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Board {

    private final List<List<Cell>> grid;
    private final Map<CellStatus, String> displayCell;

    public Board(List<List<Cell>> grid, Map<CellStatus, String> displayCell) {
        this.grid = grid;
        this.displayCell = displayCell;
    }

    public void print() {
        for (List<Cell> row : grid) {
            for (Cell cell : row) {
                System.out.print(" " + this.displayCell.get(cell.getCellStatus()));
            }
            System.out.println(" ");
        }
    }

    public List<List<Cell>> live() {
        List<List<Cell>> newGrid = new ArrayList<>();

        for (int y = 0; y < grid.size(); y++) {
            List<Cell> row = new ArrayList<>();

            for (int x = 0; x < grid.get(y).size(); x++) {
                List<Coordinate> neighbours = getNeighbours(new Coordinate(y, x));

                row.add(getNewCellState(grid.get(y).get(x), neighbours.size()));
            }

            newGrid.add(row);
        }

        return newGrid;
    }

    public List<Coordinate> getNeighbours(Coordinate coordinate) {
        final List<Coordinate> neighbours = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                Coordinate coordinateCandidate = new Coordinate(coordinate.getY() + i, coordinate.getX() + j);
                this.areSideBySide(coordinate, coordinateCandidate);
                if (this.areSideBySide(coordinate, coordinateCandidate) &&
                        this.grid.get(coordinateCandidate.getY()).get(coordinateCandidate.getX()).getCellStatus().equals(CellStatus.ALIVE)) {
                    neighbours.add(new Coordinate(coordinate.getY() + i,coordinate.getX() + j));
                }
            }
        }

        return neighbours;
    }

    private boolean areSideBySide(Coordinate coordinateA, Coordinate coordinateB) {
        return !coordinateA.equals(coordinateB) &&
                0 <= coordinateB.getY() && coordinateB.getY() < this.grid.size() &&
                0 <= coordinateB.getX() && coordinateB.getX() < this.grid.get(coordinateB.getY()).size();
    }

    private Cell getNewCellState(Cell cell, int neighbours) {
        Cell newCell = cell;

        if (cell.getCellStatus().equals(CellStatus.ALIVE) && neighbours < 2) {
            newCell = new Cell(CellStatus.DEATH);
        } else if (cell.getCellStatus().equals(CellStatus.ALIVE) && neighbours > 3) {
            newCell = new Cell(CellStatus.DEATH);
        } else if (cell.getCellStatus().equals(CellStatus.DEATH) && neighbours == 3) {
            newCell = new Cell(CellStatus.ALIVE);
        }

        return newCell;
    }
}
