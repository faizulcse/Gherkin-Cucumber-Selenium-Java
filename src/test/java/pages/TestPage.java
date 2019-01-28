package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {
    public TestPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="email") WebElement email;
    @FindBy(id ="pass") WebElement pass;
    @FindBy(id ="loginbutton") WebElement login;

    public void testClick(){
        email.sendKeys("asdf@gmail.com");
        pass.sendKeys("asdf233");
        waitFor(1);
        login.click();
    }

}
