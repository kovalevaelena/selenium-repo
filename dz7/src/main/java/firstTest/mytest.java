package firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class mytest {

    private  WebDriver driver;
    private WebDriverWait wait;

    @Before
    public  void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://localhost/litecart/admin/");
    }

    @Test
    public void MyTest(){

        /*добрый день, Алексей! подскажите, пожалуйста, программа ругается на 33 строку - по могу понять в чем дело. Заранее спасибо за помощь.*/

        WebElement leftmenu =  driver.findElement(By.cssSelector("ul.list-vertical"));
        point = leftmenu.findElements(By.tagName("a"));
        for (int i = 0; i < point; i++) {
            driver.findElement(By.xpath("./a[i]")).click();
            wait(1000);
            driver.findElement(By.tagName("h1"));
        }
        }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
