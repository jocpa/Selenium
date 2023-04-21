package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/popups.html");

        //maximizar browser
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/button")).click();
        Thread.sleep(300);
        driver.switchTo().alert().accept();
        
        
        
    }

}
