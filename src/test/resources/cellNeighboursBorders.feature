Feature: Searching neighbour for a border cell

  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 0,0 top left of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 0,0
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 1                     |
      | 1                  | 0                     |
      | 1                  | 1                     |


  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 0,1 top right of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 0,1
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 1                  | 0                     |
      | 1                  | 1                     |

  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 1,0 bottom left of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 1,0
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 1                  | 1                     |
      | 0                  | 1                     |


  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 1,1 bottom right of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 1,1
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 0                  | 1                     |
      | 1                  | 0                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 0,1 top center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 0,1
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 1                  | 0                     |
      | 1                  | 1                     |
      | 1                  | 2                     |
      | 0                  | 2                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 1,2 right center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 1,0
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 2                     |
      | 0                  | 1                     |
      | 1                  | 1                     |
      | 2                  | 1                     |
      | 2                  | 2                     |


  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 1,0 left center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 1,1
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 0                     |
      | 0                  | 1                     |
      | 1                  | 1                     |
      | 2                  | 1                     |
      | 0                  | 2                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 2,1 bottom center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the position 1,1
    And a cell has been living at the position <Cell2 position row>,<Cell2 position column>
    When we search for neighbours
    Then the cells should be considered as neighbour
    Examples:
      | Cell2 position row | Cell2 position column |
      | 0                  | 2                     |
      | 0                  | 1                     |
      | 1                  | 1                     |
      | 1                  | 2                     |
      | 2                  | 2                     |
