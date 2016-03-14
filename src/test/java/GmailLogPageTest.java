import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 14.03.2016.
 */
public class GmailLogPageTest {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver.exe");
        driver = new ChromeDriver();

    }
        @Test
    public void SingIn()throws Exception{
            GmailLogPage page = new GmailLogPage(driver);
            driver.get("https://mail.google.com");
            page.SetEmail("idrygin@gmail.com");
            page.Next();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            page.SetUserPwd("you_pwd");
            page.SetCheckBox();
            page.SingIn();
            if (page.cheker.isDisplayed()){
                System.out.println("OK");
            }

        }

}
