Feature:
  Background:
    Given Go to trendyol app
  @test
  Scenario:
    Then  Click on the My Account icon
    Then  Select the mail address
    Then  Enter the password
    Then  Go to homepage
    Then  Click on the Search textbox
    Then  Search for this product: "Ayakkabi"
    Then  Sort products by bestsellers
    Then  Filter by shoe brand "puma"
    Then  Select product from the list
    Then  Choose shoe size and add to cart
    Then  Confirm cart
    Then  Click the add delivery address button
    Then  Click the add to address button
    Then  Enter contact and address details
    Then  Click on the save button
    Then  Enter your card details
    Then  Click on the confirm and finish button
    Then  Close the aplication