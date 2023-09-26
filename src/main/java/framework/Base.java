package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Base {


     void openBrowser(String browserName, boolean headless);
     void openApplicationURL(String appURL);
     void click(WebElement element);
     void doubleClick(WebElement element);
     void rightClick(WebElement element);
     void enterValues(WebElement element, String value);
     void enterValuesOption2(WebElement element, String value);
     void moveToElement(WebElement element);
     void scrollDownToElement(WebElement element);
     void selectDropDown(WebElement element, String value);


     boolean verifyEnabledOrDisabled(WebElement element);
     String getTextOf(WebElement element);
     String getAttributeOf(WebElement element);



}
