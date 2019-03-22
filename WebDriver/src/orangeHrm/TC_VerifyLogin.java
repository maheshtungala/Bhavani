package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		//verify pagetitle
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("TC_VerifyLogin Passed!");
			}else{
				System.out.println("TC_VerifyLogin Failed!");
			}
		//click the logout link
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
