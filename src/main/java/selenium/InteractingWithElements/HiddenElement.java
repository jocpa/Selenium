package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
    
    public static void main(String[] args) {

        String url = "https://automationtesting.co.uk/hiddenElements.html";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        System.out.println(
            driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div/p[2]")).isDisplayed()
        );
        System.out.println(
            driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div/p[3]")).isDisplayed()
        );
        
        }
        
    }


