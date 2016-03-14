import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GmailLogPage {
    private WebDriver driver;

    //Locators
    @FindBy(id = "gbqfq")
    WebElement cheker;

    @FindBy(id = "Email")
    private WebElement UserName;

    @FindBy(id = "next")
    private WebElement NextBtn;

    @FindBy(name = "Passwd")
    private WebElement UserPassword;

    @FindBy(id = "PersistentCookie")
    private WebElement StaySignedInCheckbox;



    @FindBy(id = "signIn")
    private WebElement SingIn;

    //Constructor

    public GmailLogPage(WebDriver driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);

    }

    public void SetEmail(String Login) {
        UserName.clear();
        UserName.sendKeys(Login);

    }

    public void Next(){
        NextBtn.click();
    }
    public void SetUserPwd(String password) {
       // UserPassword.clear();
        UserPassword.sendKeys(password);

    }
    public void SetCheckBox(){
        StaySignedInCheckbox.click();
    }

    public void SingIn(){
        SingIn.click();
    }

}
