package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class AddProductSteps {
    WebDriver driver;

//    public AddProductSteps() {
//        driver = Hooks.driver;
//    }

    @Given("the user is logged in")
    public void userIsLoggedIn() {
        // Implement login steps here or use a Given step from the Login feature
    }

    @When("the user tries to add an out-of-stock product to the cart")
    public void userTriesToAddOutOfStockProductToCart() {
        WebElement outOfStockProduct = driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]"));
        outOfStockProduct.click();
    }

    @Then("the user should see an error message")
    public void userSeesErrorMessage() {
        WebElement errorMessage = driver.findElement(By.className("error-button"));
        assertTrue(errorMessage.isDisplayed());
    }
}
