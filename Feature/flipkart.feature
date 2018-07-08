

Feature: user buy the product from flipkart 
 
 Scenario Outline: Title of your scenario outline
    Given The user is in filpkart homepage 
    And The user search for a "<product>"
    When The user adds the"<itembox>" for a  product
    Then The user verifies the item in a cart"<product>"

    Examples: 
      | product    | itembox |
      | iphone x   |     2    |
      | one plus 6 |    5     |
      |redmi note 5|    8     |
  