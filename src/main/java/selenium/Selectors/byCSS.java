package selenium.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byCSS {
    
    public static void main(String[] args) {

        String url = "https://automationtesting.co.uk/buttons.html";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.cssSelector("#btn_one")).click();
        
    }

}
