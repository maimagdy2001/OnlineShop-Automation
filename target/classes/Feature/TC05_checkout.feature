Feature:  Ensure that the user can successfully complete the purchase

  @smoke

  Scenario: verify that the user can complete the purchase successfully
    When user click on login button
    And user login with valid "testuser12356" and "123456"
    And press on login button
    Then verify user login successfully "testuser12356"
#    And click on laptop in categories
#    And click on the first laptop
#    And click on add to cart button
#    And verify that the product added to the cart
#    And go back to the laptops page
#    And click on the second laptop
#    And click on add to cart button
#    Then verify that the product added to the cart
    And click on cart putton
    And verify that the product1 added to the cart with the same titel and price
    And verify that the product2 added to the cart with the same titel and price
    Then verify that total amount is display corectally for poth product
    And click on place order button
    And Verify that the total amount is calculated correctly
    And fill data name "mai" country "London" city "montonegro" card "1234567891234567" month "12" year "25"
    And click purchase button
    Then verify the purchase completed succesfully