Feature: Searching neighbours for a center cell

  Scenario Outline: Cells neighbours in a grid 3, 3 for the centers cell
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell2 position row>,<Cell2 position column>
    When we search for neighbours of the cell at coordinate 1,1
    Then the cell at the coordinate <Cell2 position row>,<Cell2 position column> should be neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 0                  | 1                     |
      | 0                  | 2                     |
      | 1                  | 0                     |
      | 1                  | 2                     |
      | 2                  | 0                     |
      | 2                  | 1                     |
      | 2                  | 2                     |

  Scenario Outline: Cells neighbour in a grid 4, 4 for the centers cells
    Given a grid of a horizontal and vertical length of 4
    And a cell has been living at the coordinate <Cell2 position row>,<Cell2 position column>
    When we search for neighbours of the cell at coordinate <Cell1 position row>,<Cell1 position column>
    Then the cell at the coordinate <Cell2 position row>,<Cell2 position column> should be neighbour
    Examples:
      | Cell1 position row | Cell1 position column  | Cell2 position row | Cell2 position column |
      | 1                  | 1                      | 0                  | 0                     |
      | 1                  | 1                      | 0                  | 1                     |
      | 1                  | 1                      | 0                  | 2                     |
      | 1                  | 1                      | 1                  | 0                     |
      | 1                  | 1                      | 1                  | 2                     |
      | 1                  | 1                      | 2                  | 0                     |
      | 1                  | 1                      | 2                  | 1                     |
      | 1                  | 1                      | 2                  | 2                     |
      | 1                  | 2                      | 0                  | 1                     |
      | 1                  | 2                      | 0                  | 2                     |
      | 1                  | 2                      | 0                  | 3                     |
      | 1                  | 2                      | 1                  | 1                     |
      | 1                  | 2                      | 1                  | 3                     |
      | 1                  | 2                      | 2                  | 1                     |
      | 1                  | 2                      | 2                  | 2                     |
      | 1                  | 2                      | 2                  | 3                     |
      | 2                  | 1                      | 1                  | 0                     |
      | 2                  | 1                      | 1                  | 1                     |
      | 2                  | 1                      | 1                  | 2                     |
      | 2                  | 1                      | 2                  | 0                     |
      | 2                  | 1                      | 2                  | 2                     |
      | 2                  | 1                      | 3                  | 0                     |
      | 2                  | 1                      | 3                  | 1                     |
      | 2                  | 1                      | 3                  | 2                     |
      | 2                  | 2                      | 1                  | 1                     |
      | 2                  | 2                      | 1                  | 2                     |
      | 2                  | 2                      | 1                  | 3                     |
      | 2                  | 2                      | 2                  | 1                     |
      | 2                  | 2                      | 3                  | 1                     |
      | 2                  | 2                      | 3                  | 1                     |
      | 2                  | 2                      | 3                  | 2                     |
      | 2                  | 2                      | 3                  | 3                     |