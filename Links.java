package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("nivethaece0798@gmail.com");


		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input"));
		element.sendKeys("with edit fields",Keys.TAB);

		System.out.println(driver.findElement(By.xpath("//input[@name='username'][1]")).getAttribute("value"));

		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();

		if(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled())
			System.out.println("Field is enabled");
		else
			System.out.println("Field is disabled");
		Thread.sleep(5000);
		driver.close();
	}
}
