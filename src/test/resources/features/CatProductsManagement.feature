Feature: Cat Products Management

  Scenario: Review cat products
    Given the user is on Main page
    When the user clicks on Cats button under Main Menu
    Then Cats screen should load
    And Cats screen should contain products table with following entries:
      |        id |    name |
      | FL-DSH-01 |    Manx |
      | FL-DLH-02 | Persian |