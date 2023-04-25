package selenium.Parameterising;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DriverInstall {
    
    WebDriver driver;

    @BeforeSuite
    public void setup() throws FileNotFoundException, IOException{
        
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("src\\test\\java\\selenium\\Parameterising\\config.properties");
        prop.load(data);
        	
		
        if(prop.getProperty("browser").equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if( prop.getProperty("browser").equals("firefox") ) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();

        }else {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();

        }

        driver.manage().window().maximize();

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
