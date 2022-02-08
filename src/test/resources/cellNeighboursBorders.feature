Feature: Two living cells are neighbours through the border of the grid

  Scenario: A living cell is in range to touch another living cell through the grid borders
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 0,0
    And a cell has been living at the position 0,4
    When we search for neighbours
    Then the cells should be considered neighbours
