Feature: Searching neighbour for a border cell

  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 0,0 top left of the grid
    Given a grid of a horizontal and vertical length of 2
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 0,0
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 1                     |
      | 1                  | 0                     |
      | 1                  | 1                     |

  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 0,1 top right of the grid
    Given a grid of a horizontal and vertical length of 2
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 0,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 0                     |
      | 1                  | 0                     |
      | 1                  | 1                     |

  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 1,0 bottom left of the grid
    Given a grid of a horizontal and vertical length of 2
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 1,0
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 0                     |
      | 1                  | 1                     |
      | 0                  | 1                     |


  Scenario Outline: Cells neighbour in a grid 2, 2 for a cell 1,1 bottom right of the grid
    Given a grid of a horizontal and vertical length of 2
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 1,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 0                     |
      | 0                  | 1                     |
      | 1                  | 0                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 0,1 top center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 0,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 0                     |
      | 1                  | 0                     |
      | 1                  | 1                     |
      | 1                  | 2                     |
      | 0                  | 2                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 1,2 right center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 1,2
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 2                     |
      | 0                  | 1                     |
      | 1                  | 1                     |
      | 2                  | 1                     |
      | 2                  | 2                     |


  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 1,0 left center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 1,0
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 0                  | 0                     |
      | 0                  | 1                     |
      | 1                  | 1                     |
      | 2                  | 1                     |
      | 2                  | 0                     |

  Scenario Outline: Cells neighbour in a grid 3, 3 for a cell 2,1 bottom center of the grid
    Given a grid of a horizontal and vertical length of 3
    And a cell has been living at the coordinate <Cell position y>,<Cell position x>
    When we search for neighbours of the cell at coordinate 2,1
    Then the cell at the coordinate <Cell position y>,<Cell position x> should be neighbour
    Examples:
      | Cell position y    | Cell position x       |
      | 2                  | 0                     |
      | 1                  | 0                     |
      | 1                  | 1                     |
      | 1                  | 2                     |
      | 2                  | 2                     |
