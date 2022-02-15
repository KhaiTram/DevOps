package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class OwnerAddGuiTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anna\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:4200/petclinic/");
			driver.manage().window().maximize();
			//OwnerAdd
			driver.findElement(By.className("dropdown-toggle")).click();
			driver.findElement(By.className("glyphicon-plus")).click();	//AddOwner
			driver.findElement(By.id("firstName")).sendKeys("Klaus");	//insert firstname
			driver.findElement(By.id("lastName")).sendKeys("Mecker");	//insert lastname
			driver.findElement(By.id("address")).sendKeys("Schulendorfer 29");	//insert address
			driver.findElement(By.id("city")).sendKeys("Brem");	//insert city
			driver.findElement(By.id("telephone")).sendKeys("01777485228");	//insert phonenumber
			driver.findElement(By.xpath("//button[contains(text(),'Add Owner')]")).click();

			if(driver.findElement(By.xpath("//a[contains(text(),'Mecker')]")).isDisplayed()){
				System.out.println("OwnerAddTest successful!");
			} else {
				System.out.println("OwnerAddTest fail");
			}
	}
}