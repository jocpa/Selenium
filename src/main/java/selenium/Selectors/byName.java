package selenium.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byName {
    
    public static void main(String[] args) {

        String url = "https://automationtesting.co.uk/contactForm.html";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        //Selector by name
        driver.findElement(By.name("first_name")).sendKeys("Miles");
        
        
    }

}
