package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.Before;
import io.cucumber.java.After;


public class LoginSteps {
    WebDriver driver;

//    public LoginSteps() {
//        driver = Hooks.driver;
//    }

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("the user clicks the login button")
    public void userClicksLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("the user should be on the products page")
    public void userIsOnProductsPage() {
        WebElement productsTitle = driver.findElement(By.className("product_label"));
        assertEquals("Products", productsTitle.getText());
    }
}
