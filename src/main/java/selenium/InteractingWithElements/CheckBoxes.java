package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/dropdown.html");

        //maximizar browser
        driver.manage().window().maximize();

        System.out.println( driver.findElement(By.cssSelector("#cb_red")).isSelected() );
        
        System.out.println( driver.findElement(By.cssSelector("#cb_green")).isSelected() );

        driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div:nth-child(2) > label:nth-child(6)")).click();

        

    }//cb_green

}
