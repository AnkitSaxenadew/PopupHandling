package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.bigbasket.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[text()='Login'])[3]")).click();
		
//		WebElement buser = driver.findElement(By.xpath("//button[text()='Business user ']"));
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		buser.click();
		// or
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement buser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Business user ']")));
		buser.click();
		
		driver.findElement(By.id("loginemail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("44646");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		String xp = "(//input[@id='loginemail']/following-sibling::label)[2]";
		String expected = "Please login using the OTP option";
		
//		Boolean flag = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xp), expected));
//		System.out.println(flag);
//		
//		if (flag)        //true
//		{
//			System.out.println(driver.findElement(By.xpath(xp)).getText());
//			
//		}
//		
//		else
//		{
//		System.out.println("Text still not present");	
//		}
		// or
		
		WebElement msg = driver.findElement(By.xpath(xp));
		Boolean flag = wait.until(ExpectedConditions.textToBePresentInElement(msg, expected));
		
	  System.out.println(flag);
		if (flag)
		{
			System.out.println(msg.getText());
		}
		
		else
		{
			System.out.println("Text still not present");
			
		}
		
	}

}
