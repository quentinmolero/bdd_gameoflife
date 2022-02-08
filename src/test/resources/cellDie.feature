Feature: A living cell die

  Scenario: A cell is alone
    Given a cell has been living at the position 0,0
    And the cell had 0 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by underpopulation
    Given a cell has been living at the position 0, 0
    And the cell had 1 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1, 1
    And the cell had 4 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1, 1
    And the cell had 5 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1, 1
    And the cell had 6 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1, 1
    And the cell had 7 living neighbours
    When the next generation is computed
    Then the cell should die

  Scenario: A cell die by overcrowding
    Given a cell has been living at the position 1, 1
    And the cell had 8 living neighbours
    When the next generation is computed
    Then the cell should die
