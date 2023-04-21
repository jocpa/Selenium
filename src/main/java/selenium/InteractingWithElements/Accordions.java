package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordions {
    
    public static void main(String[] args) {

        String url = "https://automationtesting.co.uk/accordion.html";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[1]")).click();
        
        for(int i=0; i < 2 ; i++) {
            driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[3]")).click();
            driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[5]")).click();
        }
        
    }

}
//*[@id="main"]/div/div/div/div[3]
//*[@id="main"]/div/div/div/div[5]
