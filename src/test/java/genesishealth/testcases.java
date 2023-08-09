package genesishealth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases {
    	
    public static WebDriver driver;
    
    @BeforeMethod
    public void launchDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP WORLD\\Downloads\\New folder\\chromedriver.exe");
        driver = new ChromeDriver(); // Initialize the driver here
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
   
    @Test
    public void Testcase1() throws InterruptedException {
    	driver.get("https://stg.genesishealth.ai");
    	Thread.sleep(9000);
    }

    @Test
    public void Testcase2() throws InterruptedException {
         driver.findElement(By.className("ant-input-status-success css-sk7ap8")).sendKeys("test@gmail.com");
         Thread.sleep(4000);
         driver.findElement(By.cssSelector("#password > span > input")).sendKeys("123456789");
         Thread.sleep(3000);
     }
    
    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
