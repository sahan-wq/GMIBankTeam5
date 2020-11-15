package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMICustomerPage {
    public  GMICustomerPage (){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//*[@id='account-menu']/a/span")
    public WebElement signedInUserName;
    @FindBy (xpath = "//*[@id='entity-menu']/a/span")
    public WebElement myOperations;
    @FindBy (xpath = "//*[@id='entity-menu']/div/a[1]")
    public WebElement myAccount;
    @FindBy (xpath = "//*[@id='entity-menu']/div/a[2]")
    public WebElement transferMoney;

}
