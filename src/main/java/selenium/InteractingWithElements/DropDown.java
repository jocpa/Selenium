package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/dropdown.html");

        //maximizar browser
        driver.manage().window().maximize();

        Select carSelection = new Select ( driver.findElement(By.cssSelector("#cars")) ); 
        carSelection.selectByVisibleText("Jeep");
        
        

        

    }

}
