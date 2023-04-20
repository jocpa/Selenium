package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/contactForm.html");

        //maximizar browser
        driver.manage().window().maximize();

        driver.findElement(By.name("first_name")).sendKeys("Miles");
        driver.findElement(By.name("last_name")).sendKeys("Morales");
        driver.findElement(By.name("email")).sendKeys("miles@miles.com");
        driver.findElement(By.name("message")).sendKeys("This is an automate test");
        driver.findElement(By.xpath("//*[@id='form_buttons']/input[2]")).click();

    }

}
