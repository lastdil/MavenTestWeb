import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 14.03.2016.
 */
public class GmailLogPageTest {

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver.exe");
        driver = new ChromeDriver();
        GmailLogPage page = new GmailLogPage(driver);
        driver.get("https://mail.google.com");
        page.SetEmail("your_email");
        page.Next();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page.SetUserPwd("Your_PWD");
        page.SetCheckBox();
        page.SingIn();
        if (page.cheker.isDisplayed()) {
            System.out.println("Login Success");
        }
        Thread.sleep(1000);
    }

        @Test
        public void ComposeMail() throws Exception{
            GmailMainPage page1 = new GmailMainPage(driver);
            page1.CreateNewMail();
            //enter details
            page1.EnterRecepient("idrygin@gmail.com");
            page1.EnterSubject("its works!");
            page1.SendMail();
            page1.Refresh();
        }

        @AfterTest
            public void TearDown() throws Exception {
            driver.quit();
        }

}
