package StepDefinition;


import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver=browserFactory.startBrowser("chrome", "http://www.way2automation.com/angularjs-protractor/banking/#/login");



}
