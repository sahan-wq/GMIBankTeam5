package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIHomePage {
    public GMIHomePage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a)[1]")
    public WebElement userIcon;
    @FindBy (xpath = "//*[@id='login-item']/span")
    public WebElement SignInHomePage;


}
