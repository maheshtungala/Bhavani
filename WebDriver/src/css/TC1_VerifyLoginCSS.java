package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_VerifyLoginCSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.findElement(By.cssSelector("input.loginText[type=text]")).sendKeys("qaplanet1");
		driver.findElement(By.cssSelector("input.loginText[type=password]")).sendKeys("lab1");
		driver.findElement(By.cssSelector("input.button[value=Login]")).click();
		
		//verify pagetitle
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("TC_VerifyLogin Passed!");
			}else{
				System.out.println("TC_VerifyLogin Failed!");
			}
		//click the logout link
		driver.findElement(By.cssSelector("ul#option-menu>li:nth-child(3)>a")).click();
		driver.close();
	}

}
