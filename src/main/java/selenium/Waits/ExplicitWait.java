package selenium.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
    
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/loader.html");

        //maximizar browser
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#loaderBtn")));

        driver.findElement(By.cssSelector("#loaderBtn")).click();
    }

}
