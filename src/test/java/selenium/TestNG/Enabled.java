package selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Enabled {
    
    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();driver.manage().window().maximize();	
		Thread.sleep(2000);
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
    }

    @Test (enabled = false)
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("miles@miles.com");
        Thread.sleep(2000);
    }
    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TeamoGwen");
        Thread.sleep(2000);
    }
    
    

}
