package framework;

import constent.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.cert.Certificate;

public class M2A implements Base{
    private WebDriver driver = null;

    private void openURL(String applicationURL){

    }

    public void openBrowser(String browserName) {

    }

    public void openBrowser(String browserName, boolean headless) {
        if(browserName.equalsIgnoreCase("CHROME")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setAcceptInsecureCerts(true);
            chromeOptions.setHeadless(headless);
            driver = new ChromeDriver(chromeOptions);
        }
        else if(browserName.equalsIgnoreCase("EDGE")){

        }
    }

    public void openApplicationURL(String appURL) {

    }

    public void click(WebElement element) {

    }

    public void doubleClick(WebElement element) {

    }

    public void rightClick(WebElement element) {

    }

    public void enterValues(WebElement element, String value) {

    }

    public void enterValuesOption2(WebElement element, String value) {

    }

    public void moveToElement(WebElement element) {

    }

    public void scrollDownToElement(WebElement element) {

    }

    public void selectDropDown(WebElement element, String value) {

    }

    public boolean verifyEnabledOrDisabled(WebElement element) {
        return false;
    }

    public String getTextOf(WebElement element) {
        return null;
    }

    public String getAttributeOf(WebElement element) {
        return null;
    }
}
