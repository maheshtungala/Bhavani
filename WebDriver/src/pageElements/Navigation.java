package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        
        //maximize the browser...
        driver.manage().window().maximize();
        
        //get the currentUrl...
        System.out.println(driver.getCurrentUrl());
        
        //click the gmail link..
        driver.findElement(By.linkText("Gmail")).click();
        
        Thread.sleep(3000);
        //click the back button
        driver.navigate().back();
        
        Thread.sleep(3000);
        //click the forward button...
        driver.navigate().forward();
        
        Thread.sleep(3000);
        //click the refresh button...
        driver.navigate().refresh();
        
        System.out.println(driver.getCurrentUrl());

	}
}
