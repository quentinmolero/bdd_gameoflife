Feature: A cell survive

  Scenario: A cell with two neighbours
    Given a cell has been living at the position 0,0
    And the cell at position 0,0 had 2 living neighbours
    When the next generation is computed
    Then the cell at position 0,0 should survive

  Scenario: A cell with three neighbours
    Given a cell has been living at the position 0,0
    And the cell at position 0,0 had 3 living neighbours
    When the next generation is computed
    Then the cell at position 0,0 should survive
