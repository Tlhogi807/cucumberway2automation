package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class steps {

    WebDriver driver;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("I click on the customer login button")
    public void i_click_on_the_customer_login_button()
    {
        driver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
    }
    @When("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String string)
    {
        driver.findElement(By.xpath("//select[@name='userSelect']")).click();

    }
    @When("I click the login button")
    public void i_click_the_login_button() {

    }
    @Then("I should be redirected to my account dashboard")
    public void i_should_be_redirected_to_my_account_dashboard() {

    }

}
