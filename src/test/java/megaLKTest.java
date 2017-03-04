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

    @BeforeTest
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver");
        driver = new ChromeDriver();
        MegafonLkpage page = new MegafonLkpage(driver);
        driver.get("https://lk.megafon.ru/login/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @Test
    public void login() throws Exception {
        MegafonLkpage page1 = new MegafonLkpage(driver);
        page1.SetLogin("9210000000");
        page1.SetUserPwd("yourPWD123");
        page1.SingIn();
    }

//    @AfterTest
//    public void TearDown() throws Exception {
//        driver.quit();
//    }
}
