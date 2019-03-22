package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/QAPlanet.html");
		
		//get the 2nd row 2nd col using its xpath...
	/*String text = driver.findElement(By.xpath
				("//html/body/table/tbody/tr[2]/td[2]")).getText();*/
		
		//use relative xpath..
	/*	String text = driver.findElement(By.xpath
				("//table/tbody/tr[2]/td[2]")).getText();*/
		
	/*	String text = driver.findElement(By.xpath
				("//table[@id='Table1']/tbody/tr[2]/td[2]")).getText(); */
		
		String text = driver.findElement(By.xpath
				("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(text);
		driver.close();

	}

}
