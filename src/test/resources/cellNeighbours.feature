Feature: Searching neighbours for a center cell

  Scenario Outline: Cells neighbours in a grid 4, 4 for the center cell
    Given a grid of a horizontal and vertical length of 4
    And a cell <has been living> at the coordinate <Cell position y>,<Cell position x>
    And the coordinate <Cell position y>,<Cell position x> <is beside> than coordinate 1,1
    When we search for neighbours of the cell at coordinate 1,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should <be neighbour>
    Examples:
      | Cell position y | Cell position x | has been living   | is beside       | be neighbour       |
      | 0               | 0               | "has been living" | "is beside"     | "be neighbour"     |
      | 0               | 1               | "has been living" | "is beside"     | "be neighbour"     |
      | 0               | 2               | "has been living" | "is beside"     | "be neighbour"     |
      | 1               | 0               | "has been living" | "is beside"     | "be neighbour"     |
      | 1               | 2               | "has been living" | "is beside"     | "be neighbour"     |
      | 2               | 0               | "has been living" | "is beside"     | "be neighbour"     |
      | 2               | 1               | "has been living" | "is beside"     | "be neighbour"     |
      | 2               | 2               | "has been living" | "is beside"     | "be neighbour"     |
      | 2               | 2               | "has been dead"   | "is beside"     | "not be neighbour" |
      | 3               | 2               | "has been living" | "is not beside" | "not be neighbour" |
