Feature: A cell comes to life

  Scenario: A dead cell with 3 neighbours
    Given a cell has been dead
    And the cell had 3 living neighbours
    When the next generation is computed
    Then the cell should come to life
