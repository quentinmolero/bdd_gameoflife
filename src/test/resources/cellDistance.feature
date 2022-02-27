Feature: Check neighbour distance

  Scenario Outline: A cell is up to 1 distance of another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell is in coordinate 2,2
    When we check if the cell at coordinate <Cell position y>,<Cell position x> is beside the cell at coordinate 2,2
    Then the cells should be beside each other
    Examples:
      | Cell position y | Cell position x |
      | 1               | 1               |
      | 1               | 2               |
      | 1               | 3               |
      | 2               | 1               |
      | 2               | 3               |
      | 3               | 1               |
      | 3               | 2               |
      | 3               | 3               |

  Scenario Outline: A cell is more than 1 distance of another cell
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