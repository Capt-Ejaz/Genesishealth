package genesishealth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager; // Import WebDriverManager

public class testcases {
    	
    public static WebDriver driver;
    
    @BeforeMethod
    public void launchDriver() {
        // Set up ChromeDriver using WebDriver Manager
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver(); // Initialize the driver here
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
   
    @Test
    public void Testcase1() throws InterruptedException {
    	driver.get("https://stg.genesishealth.ai");
    	Thread.sleep(9000);
    }

    // Add your other test methods here
    
    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
