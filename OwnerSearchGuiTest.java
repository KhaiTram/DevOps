package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnerSearchGuiTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anna\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:4200/petclinic/");
			driver.manage().window().maximize();
			//OwnerSearch
			driver.findElement(By.className("dropdown-toggle")).click();//Owner
			driver.findElement(By.className("glyphicon-search")).click();	//SearchOwner
			driver.findElement(By.id("lastName")).sendKeys("Mecker");	//searchLastname
			driver.findElement(By.xpath("//button[contains(text(),'Find Owner')]")).click();
			

			if(driver.findElement(By.xpath("//a[contains(text(),'Mecker')]")).isDisplayed()){
				System.out.println("OwnerSearchTest successful!");
			} else {
				System.out.println("OwnerSearchTest fail");
			}
			//driver.close();
			
			
	}

}
