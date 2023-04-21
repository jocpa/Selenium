package selenium;
// import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
 
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/loader.html");

        //maximizar browser
        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.findElement(By.cssSelector("#loaderBtn")).click();
       
        
    }
    
}
