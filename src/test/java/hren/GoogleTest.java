package hren;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class GoogleTest {
    WebDriver driver;

    @BeforeSuite

    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.dk");
    }
    @Test
    public void googleSearch(){
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Boston Terrier");
        search.submit();


    }



}
