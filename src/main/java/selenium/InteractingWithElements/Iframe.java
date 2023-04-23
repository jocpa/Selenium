package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        String url = "https://automationtesting.co.uk/iframes.html";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("div#sidebar > .toggle")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector("div#sidebar > .toggle")).click();

        Thread.sleep(2000);

        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//*[@id='movie_player']/div[4]/button")).click();

    } 

}
