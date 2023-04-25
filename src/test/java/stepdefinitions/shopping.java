package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class shopping {

    Trendyol trendyol = new Trendyol();
    Actions actions = new Actions(Driver.getAppiumDriver());
    TouchAction touchAction;

    @Given("Go to trendyol app")
    public void go_to_trendyol_app() {
        Driver.getAppiumDriver();
    }
    @Then("Gender selection is made")
    public void gender_selection_is_made() {
        ReusableMethods.bekle(1);
        trendyol.genderSelect.click();
    }
    @Then("Explore suggestions are turned off")
    public void explore_suggestions_are_turned_off() {
        ReusableMethods.bekle(1);
       if (trendyol.insuranceExit.isDisplayed()){
            trendyol.insuranceExit.click();
        }
    }
    @Then("Click on the My Account icon")
    public void click_on_the_my_account_icon() {
        ReusableMethods.bekle(1);
        trendyol.hesabimIcon.click();
    }
    @Then("Select the mail address")
    public void select_the_mail_address() {
        ReusableMethods.bekle(1);
        trendyol.mailText.click();
    }
    @Then("Enter the password")
    public void enter_the_password() {
        ReusableMethods.bekle(1);
        trendyol.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.bekle(1);
        trendyol.loginButton.click();
    }
    @Then("Go to homepage")
    public void go_to_homepage() {
        ReusableMethods.bekle(2);
        trendyol.homePageIcon.click();
    }
    @Then("Ad closes")
    public void ad_closes() {
    ReusableMethods.bekle(1);
    trendyol.exit.click();
    }
    @Then("Click on the Search textbox")
    public void click_on_the_search_textbox() {
        trendyol.searchBox.click();
    }
    @Then("Search for this product: {string}")
    public void search_for_this_product(String searchString) {
        ReusableMethods.bekle(1);
        actions.sendKeys(searchString).build().perform();
        ReusableMethods.bekle(2);
        trendyol.shoes.click();
    }
    @Then("Sort products by bestsellers")
    public void sort_products_by_bestsellers() {
        ReusableMethods.bekle(2);
        trendyol.order.click();
        trendyol.bestsellers.click();
    }
    @Then("Filter by shoe brand {string}")
    public void filter_by_shoe_brand(String string) {
        trendyol.filterText.click();
        trendyol.brandText.click();
        trendyol.brandTypeText.click();
        trendyol.leftButton.click();
        ReusableMethods.bekle(1);
        trendyol.cinsiyetText.click();
        ReusableMethods.bekle(1);
        trendyol.erkekText.click();
        trendyol.okButton.click();
    }
    @Then("Select product from the list")
    public void select_product_from_the_list() {
        ReusableMethods.bekle(2);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1700))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 650))
                .release()
                .perform();
        ReusableMethods.bekle(1);
        trendyol.shoesImage.click();
    }
    @Then("Choose shoe size and add to cart")
    public void choose_shoe_size_and_add_to_cart() {
        ReusableMethods.bekle(1);
        trendyol.addToCartButton.click();
        ReusableMethods.bekle(1);
        trendyol.brandSize.click();
        ReusableMethods.bekle(1);
        trendyol.addToCartButton2.click();

    }
    @Then("Confirm cart")
    public void confirm_cart() {
        trendyol.approveBasketButton.click();
    }
    @Then("Close the Our new services section")
    public void close_the_our_new_services_section() {

    }
    @Then("Click the add delivery address button")
    public void click_the_add_delivery_address_button() {
        trendyol.addEditDeliveryButton.click();
        ReusableMethods.bekle(1);

    }
    @Then("Click the add to address button")
    public void click_the_add_to_address_button() {
        trendyol.addAddressButton.click();
    }
    @Then("Enter contact and address details")
    public void enter_contact_and_address_details() {
        trendyol.nameTextBox.sendKeys(ConfigReader.getProperty("name"));
        ReusableMethods.bekle(1);
        trendyol.surnameTextBox.sendKeys(ConfigReader.getProperty("surname"));
        ReusableMethods.bekle(1);
        trendyol.numberTextBox.sendKeys(ConfigReader.getProperty("number"));
        ReusableMethods.bekle(1);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1718))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 800))
                .release()
                .perform();
        trendyol.city.click();
        ReusableMethods.bekle(1);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1900))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 200))
                .release()
                .perform();
        ReusableMethods.bekle(1);
        trendyol.cityText.click();
        ReusableMethods.bekle(1);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1718))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 1100))
                .release()
                .perform();
        trendyol.districtText.click();
        ReusableMethods.bekle(1);
        trendyol.district2Text.click();
        ReusableMethods.bekle(1);
        trendyol.addressTextbox.sendKeys(ConfigReader.getProperty("address"));
        ReusableMethods.bekle(1);
        trendyol.addressBasligiTextBox.sendKeys(ConfigReader.getProperty("addressBaslik"));

    }
    @Then("Click on the save button")
    public void click_on_the_save_button() {
        ReusableMethods.bekle(1);
        trendyol.imageViewAddressName.click();
        ReusableMethods.bekle(1);
        trendyol.saveButton.click();

    }
    @Then("Enter your card details")
    public void enter_your_card_details() {
        ReusableMethods.bekle(2);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1700))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 700))
                .release()
                .perform();
        ReusableMethods.bekle(2);
        trendyol.cardNumberTextbox.click();
        actions.sendKeys(ConfigReader.getProperty("cardNumber")).build().perform();
        ReusableMethods.bekle(1);
        trendyol.mounthTextbox.click();
        trendyol.mounthText.click();
        ReusableMethods.bekle(1);
        trendyol.yearText.click();
        ReusableMethods.bekle(1);
        trendyol.cvvTextbox.sendKeys(ConfigReader.getProperty("cvv"));
        ReusableMethods.bekle(1);
        trendyol.checkBox.click();

    }
    @Then("Click on the confirm and finish button")
    public void click_on_the_confirm_and_finish_button() {
        ReusableMethods.bekle(1);
        trendyol.submitButton.click();

    }

    @Then("Close the aplication")
    public void closeTheAplication() {
        Driver.quitAppiumDriver();
    }
}
