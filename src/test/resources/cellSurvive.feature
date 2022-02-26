Feature: A cell survive

  Scenario Outline: A cell survive
    Given a cell has been living
    And the cell had <Number> living neighbours
    When the next generation is computed
    Then the cell should survive
    Examples:
      | Number |
      | 2      |
      | 3      |