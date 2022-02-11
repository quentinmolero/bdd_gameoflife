Feature: A living cell die

  Scenario: A cell is alone
    Given a cell has been living at the position 0,0
    And the cell at position 0,0 had 0 living neighbours
    When the next generation is computed
    Then the cell at position 0,0 should die

  Scenario: A cell die by underpopulation
    Given a cell has been living at the position 0,0
    And the cell at position 0,0 had 1 living neighbours
    When the next generation is computed
    Then the cell at position 0,0 should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1,1
    And the cell at position 1,1 had 4 living neighbours
    When the next generation is computed
    Then the cell at position 1,1 should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1,1
    And the cell at position 1,1 had 5 living neighbours
    When the next generation is computed
    Then the cell at position 1,1 should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1,1
    And the cell at position 1,1 had 6 living neighbours
    When the next generation is computed
    Then the cell at position 1,1 should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1,1
    And the cell at position 1,1 had 7 living neighbours
    When the next generation is computed
    Then the cell at position 1,1 should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1,1
    And the cell at position 1,1 had 8 living neighbours
    When the next generation is computed
    Then the cell at position 1,1 should die
