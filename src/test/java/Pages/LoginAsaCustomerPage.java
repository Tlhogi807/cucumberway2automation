package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginAsaCustomerPage {
    WebDriver driver;

    @FindBy(xpath = "//strong[contains(.,'XYZ Bank')]")
    WebElement xyzBank_xpath;

    public LoginAsaCustomerPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyThatXyzBankPageIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(xyzBank_xpath));
        xyzBank_xpath.isDisplayed();
    }
}
