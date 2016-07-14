import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GmailMainPage {
    private WebDriver driver;
    //Locators

    @FindBy(xpath = ("//div[@class='z0']/div"))
    private WebElement ComposeMail;


    @FindBy(className = "vO")
    private WebElement Recepient;

    @FindBy(className = "aoT")
    private WebElement Subject;

    @FindBy(xpath = ("//div[@aria-label='Send ‪(Ctrl-Enter)‬']"))
    private WebElement SendMail;

    @FindBy(css = ".asf.T-I-J3.J-J5-Ji")
    private WebElement Refresh;

    @FindBy(id = "gs_taif50")
    private WebElement SearchOnMail;

    @FindBy(xpath = "//div[contains(@id,':32')]//")
    private WebElement SelectArrow;

    @FindBy(xpath = "//div[contains(.,'Unread')]")
    private WebElement Unread;

    @FindBy(xpath = ".//*[@id=':l6']/div")
    private WebElement UnreadMess;

    @FindBy(xpath = ".//*[@id=':35']/div")
    private WebElement More;

    @FindBy(xpath = ".//*[@id=':mm']/div")
    private WebElement MarkAsRead;
    //Constructor

    public GmailMainPage(WebDriver driver) {
        this.driver = driver;

        // Init

        PageFactory.initElements(driver, this);
    }

    public void CreateNewMail() {

        ComposeMail.click();
    }

    public void EnterRecepient(String recepient) {

        Recepient.sendKeys(recepient);
    }

    public void EnterSubject(String subject) {
        Subject.sendKeys(subject);
    }

    public void SendMail() {
        SendMail.click();
    }

    public void Refresh() {
        Refresh.click();
    }

    public void Select() {
        SelectArrow.click();
    }

    public void Unread() {
        Unread.click();
    }
}
