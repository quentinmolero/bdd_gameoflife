Feature: A living cell die

  Scenario Outline: A cell die
    Given a cell has been living
    And the cell had <number> living neighbours
    When the next generation is computed
    Then the cell should die

    Examples:
      | number |
      | 0      |
      | 1      |
      | 4      |
      | 5      |
      | 6      |
      | 7      |
      | 8      |
