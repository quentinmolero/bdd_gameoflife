Feature: A cell comes to life

  Scenario: A dead cell with 3 neighbours
    Given a cell has been dead at the position 0,0
    And the cell had 3 neighbours
    When the next generation is computed
    Then the cell should come to life
