package selenium.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.POM.TestStoreLoginPage;

public class StoreLoginTest {
    
    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
        driver.manage().window().maximize();

        
        TestStoreLoginPage logPage = new TestStoreLoginPage(driver);
        logPage.getEmail().sendKeys("miles@miles.com");
        logPage.getPassword().sendKeys("TeamoGwen");
        logPage.getloginBtn().click();
    }

}
