package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSForm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/cssform.html");
		//enter username password and click login button
		
		driver.findElement(By.cssSelector("input.required")).sendKeys("mahesh");
		driver.findElement(By.cssSelector("input[class=passfield]")).sendKeys("mahesh");
		driver.findElement(By.cssSelector("input:nth-child(3)")).click();
		
		

	}

}
