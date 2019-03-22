package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//create a webelement for the username field...
		  WebElement UN = driver.findElement(By.name("txtUserName"));
		
		  if(UN.isDisplayed()){
			  System.out.println("The textbox is displayed");
		  }else{
			  System.out.println("The textbox is not displayed");
		  }
		//enter some text into the username field..
		//driver.findElement(By.name("txtUserName")).sendKeys("sre4");
		     UN.sendKeys("xsewr43");
		     
		Thread.sleep(3000);
		//clear the text field..
		//driver.findElement(By.name("txtUserName")).clear();
		  UN.clear();
		
		Thread.sleep(3000);
		//enter the correct username..
		//driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		  UN.sendKeys("qaplanet1");

	}

}
