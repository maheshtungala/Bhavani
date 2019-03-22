package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyLoginXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//verify pagetitle
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("TC_VerifyLogin Passed!");
			}else{
				System.out.println("TC_VerifyLogin Failed!");
			}
		//click the logout link
		driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
		driver.close();


	}

}
