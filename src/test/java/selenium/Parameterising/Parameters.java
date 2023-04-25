package selenium.Parameterising;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Parameters {
    
    
    WebDriver driver;

    @BeforeSuite
    public void setup() throws FileNotFoundException, IOException{
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();	
		

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("src\\test\\java\\selenium\\Parameterising\\config.properties");
        prop.load(data);

        driver.get(prop.getProperty("url"));
    }

    @Test
    public void signin() throws InterruptedException {
        
        driver.findElement(By.cssSelector("div#_desktop_user_info .hidden-sm-down")).click();

        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("miles@miles.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TeamoGwen");
        driver.findElement(By.cssSelector("#submit-login")).click();

        Thread.sleep(2000);
    }

}
