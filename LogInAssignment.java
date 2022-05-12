package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Code_Assignment1 {
	public static void main(String[] args) {
		//To setup driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		//To Maximize
		driver.manage().window().maximize();
		//To Load URL
		driver.get("https://acme-test.uipath.com/login");	
		//To capture user name
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//To capture password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//To login
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//To get title
		System.out.println(driver.getTitle());
		//To Logout
		driver.findElement(By.linkText("Log Out")).click();
	}
}
