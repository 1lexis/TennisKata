Feature: Game Test

  Scenario: The game begin
    Given The game begin against "Roger Fededer" and "Raphael Nadal"
    Then Score should be "Love all"

  Scenario: The server score one point
    Given The game begin against "Roger Fededer" and "Raphael Nadal"
    When Server score 1 points
    Then Score should be "Fifteen Love"

  Scenario: The server score two points
    Given The game begin against "Roger Fededer" and "Raphael Nadal"
    When Server score 2 points
    Then Score should be "Thirty Love"

  Scenario: The server score three points
    Given The game begin against "Roger Fededer" and "Raphael Nadal"
    When Server score 3 points
    Then Score should be "Forty Love"

  Scenario: The server score four points
    Given The game begin against "Roger Fededer" and "Raphael Nadal"
    When Server score 4 points
    Then Score should be "Game Roger Fededer"