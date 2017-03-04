import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lastdil on 04/03/2017.
 */
public class megaLKTest {
    WebDriver driver;
    private static final String login = "9210000000";
    private static final String pwd = "yourPWD123";

    @BeforeTest
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://lk.megafon.ru/login/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @Test
    public void login() throws Exception {
        MegafonLkpage page = new MegafonLkpage(driver);
        page.SetLogin(login);
        page.SetUserPwd(pwd);
        page.SingIn();
    }

/*    @AfterTest
    public void TearDown() throws Exception {
        driver.quit();
    }*/
}
