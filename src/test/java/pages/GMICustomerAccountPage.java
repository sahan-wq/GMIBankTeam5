package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMICustomerAccountPage {
    public GMICustomerAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='fromAccountId']")
    public WebElement fromAccountBox;
    @FindBy (xpath = "//*[@id='toAccountId']")
    public WebElement toAccountBox;
    @FindBy (id = "balance")
    public WebElement balanceBox;
    @FindBy (id = "description")
    public WebElement descriptionBox;
    @FindBy (id = "make-transfer")
    public WebElement makeTransferButton;
    @FindBy (xpath = "//h2")
    public WebElement transferPageText;
    @FindBy (xpath = "//div[@role='alert']")
    public WebElement successPopUpMessage;
}
