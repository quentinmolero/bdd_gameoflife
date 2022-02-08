Feature: Two living cells are neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 0,0
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 0,1
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 0,2
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 1,0
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 1,2
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 2,0
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 2,1
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is in range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 2,2
    When we search for neighbours
    Then the cells should be considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 3,0
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 3,1
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 3,2
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 3,3
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 3,4
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 4,0
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 4,1
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 4,2
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 4,3
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 4,4
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 0,3
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 1,3
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 2,3
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 0,4
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 1,4
    When we search for neighbours
    Then the cells should be not considered neighbours

  Scenario: A living cell is out of range to touch another cell
    Given a grid of a horizontal and vertical length of 5
    And a cell has been living at the position 1,1
    And a cell has been living at the position 2,4
    When we search for neighbours
    Then the cells should be not considered neighbours
