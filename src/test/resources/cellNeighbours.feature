Feature: Searching neighbours for a center cell

  Scenario Outline: Cells neighbours in a grid 3, 3 for the center cell
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 1,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y | Cell position x |
      | 0               | 0               |
      | 0               | 1               |
      | 0               | 2               |
      | 1               | 0               |
      | 1               | 2               |
      | 2               | 0               |
      | 2               | 1               |
      | 2               | 2               |