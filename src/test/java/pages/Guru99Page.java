package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Page extends BasePage {
    @FindBy(linkText = "Linux")
    WebElement linux;
    @FindBy(id = "pass")
    WebElement pass;
    @FindBy(id = "loginbutton")
    WebElement login;

    public Guru99Page() {
        PageFactory.initElements(driver, this);
    }

    public void testClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", linux);
        waitFor(5);
        linux.click();
        waitFor(5);
    }

}
