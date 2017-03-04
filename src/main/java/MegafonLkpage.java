import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lastdil on 04/03/2017.
 */
public class MegafonLkpage {


    private WebDriver driver;

    //Locators

    @FindBy(name = "j_username")
    private WebElement UserName;


    @FindBy(name = "j_password")
    private WebElement UserPassword;


    @FindBy(className = "ui-button-but")
    private WebElement SingIn;

    //Constructor

    public MegafonLkpage(WebDriver driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);

    }

    public void SetLogin(String Login) {
        UserName.clear();
        UserName.sendKeys(Login);

    }


    public void SetUserPwd(String password) {
        // UserPassword.clear();
        UserPassword.sendKeys(password);

    }


    public void SingIn() {
        SingIn.click();
    }

}


