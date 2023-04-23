package selenium.BrowserTabs;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTabs {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        String url = "https://automationtesting.co.uk/browserTabs.html";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        for(int i = 1; i<=3; i++) {
            driver.findElement(By.cssSelector("#main > div > div > div > form > input[type=submit]")).click();
        }

        ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("There are " + windowsHandles.size() + " tabs open");

        for(String item : windowsHandles) {
            driver.switchTo().window(item);
            Thread.sleep(2000);
        }

        driver.switchTo().window(windowsHandles.get(0));

    }

}
