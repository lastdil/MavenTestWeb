import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 17.02.2016.
 */
public class InstaPageTest {


    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver.exe");
        driver = new ChromeDriver();

    }
        @Test
        public void  logIN(){
            InstaPage page = new InstaPage(driver);
            driver.get("http://instagram.com");
            page.Set_User_Login("");
            page.Set_User_Passwprd("");
            page.ClickLogin();
            Assert.assertEquals("Instagram", driver.getTitle());

        }


        }






