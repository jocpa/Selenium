package selenium.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Annotations {

    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();driver.manage().window().maximize();	
		Thread.sleep(2000);
    }

    @BeforeMethod
    public void signin() {
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("div#_desktop_user_info .hidden-sm-down")).click();

        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("miles@miles.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TeamoGwen");
        driver.findElement(By.cssSelector("#submit-login")).click();
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.linkText("CLOTHES")).click();
		Thread.sleep(2000);
	}
    @AfterMethod
    public void signout() throws InterruptedException {
        driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
        Thread.sleep(2000);
    }
   
    @AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
}
