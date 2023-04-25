package selenium.Parameterising;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BasePage {
    
    public static WebDriver driver;
    private String url;

    public WebDriver getDriver() throws FileNotFoundException, IOException {

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

        return driver;
    }

    public String getUrl() throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("src\\test\\java\\selenium\\Parameterising\\config.properties");
        prop.load(data);

        url = prop.getProperty("url");

        return url;
    }
}
