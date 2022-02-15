package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteOwnerGuiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anna\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:4200/petclinic/");
			driver.manage().window().maximize();
			driver.findElement(By.className("dropdown-toggle")).click();
			driver.findElement(By.className("glyphicon-search")).click();
			driver.findElement(By.linkText("Pablos Franklin")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Delete Owner')]")).click();
	}
}