Feature: A cell comes to life

  Scenario: A dead cell with 3 neighbours
    And the cell at position 0,0 had 3 living neighbours
    When the next generation is computed
    Then the cell at position 0,0 should come to life
