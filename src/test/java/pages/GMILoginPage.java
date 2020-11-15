package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMILoginPage {
    public GMILoginPage(){ PageFactory.initElements(Driver.getDriver(),this);}
        @FindBy (xpath = "//input[@id='username']")
        public WebElement userNameBox;
        @FindBy(xpath = "//input[@id='password']")
        public WebElement passwordBox;
        @FindBy(xpath = "(//button)[4]")
        public WebElement signInButton;
        @FindBy (xpath = "//h5/span")
        public WebElement loginPageText;

}
