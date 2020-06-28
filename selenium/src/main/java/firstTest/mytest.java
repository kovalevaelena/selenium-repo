package firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class mytest {

    private  WebDriver driver;
    private WebDriverWait wait;

    @Before
    public  void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://www.google.com/");
    }

    @Test
    public void MyTest(){

        driver.findElement(By.name("q")).sendKeys("Test");
        wait.until(titleIs("Test - Поиск в Google"));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
