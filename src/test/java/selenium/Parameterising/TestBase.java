package selenium.Parameterising;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestBase extends BasePage{
   
    @Test
    public void signin() throws InterruptedException, IOException {

        driver = getDriver();
        driver.get( getUrl() );
        
        driver.findElement(By.cssSelector("div#_desktop_user_info .hidden-sm-down")).click();

        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("miles@miles.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("TeamoGwen");
        driver.findElement(By.cssSelector("#submit-login")).click();

        Thread.sleep(2000);
    }

}
