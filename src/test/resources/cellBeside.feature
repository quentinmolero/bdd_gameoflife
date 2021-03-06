Feature: Check if 2 cells beside

  Scenario Outline: A cell is not more than 1 position away on the x or y axis
    Given a grid of a horizontal and vertical length of 5
    And a cell is in coordinate 2,2
    When we check if the cell at coordinate <Cell position y>,<Cell position x> is beside the cell at coordinate 2,2
    Then the cells should <be beside> each other
    Examples:
      | Cell position y | Cell position x | be beside      |
      | 1               | 1               | "be beside"    |
      | 1               | 2               | "be beside"    |
      | 1               | 3               | "be beside"    |
      | 2               | 1               | "be beside"    |
      | 2               | 3               | "be beside"    |
      | 3               | 1               | "be beside"    |
      | 3               | 2               | "be beside"    |
      | 3               | 3               | "be beside"    |
      | 2               | 2               | "not be beside"|

  Scenario Outline: A cell is more than 1 position away on the x or y axis
    Given a grid of a horizontal and vertical length of 5
    And a cell is in coordinate 2,2
    When we check if the cell at coordinate <Cell position y>,<Cell position x> is beside the cell at coordinate 2,2
    Then the cells shouldn't be beside each other
    Examples:
      | Cell position y | Cell position x |
      | 0               | 0               |
      | 0               | 1               |
      | 0               | 2               |
      | 0               | 3               |
      | 0               | 4               |
      | 1               | 0               |
      | 1               | 4               |
      | 2               | 0               |
      | 2               | 4               |
      | 3               | 0               |
      | 3               | 4               |
      | 4               | 0               |
      | 4               | 1               |
      | 4               | 2               |
      | 4               | 3               |
      | 4               | 4               |