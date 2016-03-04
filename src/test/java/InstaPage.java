import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 17.02.2016.
 */
public class InstaPage {

    private WebDriver driver;

    private String Page_url = "http://instagram.com";
    //Locators

    @FindBy(name = "username")
    private WebElement UserName;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(css = "._rz1lq._k2yal._84y62._7xso1._nv5lf")
    private WebElement Login_Btn;

    //Constructor

    public InstaPage(WebDriver driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);

    }

    public void Set_User_Login(String Login) {
        UserName.clear();
        UserName.sendKeys(Login);
    }

    public void Set_User_Passwprd(String passwprd) {
        Password.clear();
        Password.sendKeys(passwprd);
    }

    public void ClickLogin() {
        Login_Btn.click();
    }


}