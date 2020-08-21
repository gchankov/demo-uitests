Feature: Dog Products Management

  Scenario: Review dog products
    Given the user is on Main page
    When the user clicks on Dogs button under Main Menu
    Then Dogs screen should load
    And Dogs screen should contain products table with following entries:
      |       id |               name |
      | K9-BD-01 | Bulldog            |
      | K9-PO-02 | Poodle             |
      | K9-DL-01 | Dalmation          |
      | K9-RT-01 | Golden Retriever   |
      | K9-RT-02 | Labrador Retriever |
      | MISMATCH | MISMATCH           |