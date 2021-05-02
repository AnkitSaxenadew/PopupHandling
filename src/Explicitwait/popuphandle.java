package Explicitwait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandle {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		driver.manage().window().maximize();

		String xp = "//div[@id='banner']//a[starts-with(text(),'CONTINUE')]";
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.id("Button2")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getClass().getSimpleName());
		
		String alertText = alt.getText();
		System.out.println(alertText);
		
		alt.accept();
		driver.findElement(By.id("username")).sendKeys("admin");
	
	}

}
