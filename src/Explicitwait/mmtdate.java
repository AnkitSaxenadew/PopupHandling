package Explicitwait;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmtdate {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		int currentmonth = LocalDate.now().getMonthValue();
	    int expmonth = LocalDate.now().plusMonths(3).getMonthValue();
	    String expmonthname = LocalDate.now().plusMonths(3).getMonth().name().toLowerCase();
	    expmonthname=expmonthname.substring(0, 1).toUpperCase()+expmonthname.substring(1);

		int expdate = LocalDate.now().plusDays(1).getDayOfMonth();
		
		for (int i = currentmonth; i < expmonth; i++)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		String xp = "//div[starts-with(text(),"+expmonthname+")]/ancestor::div/following-sibling::div/descendant::p[text()="+expdate+"]";
		driver.findElement(By.xpath(xp)).click();
		
		
		
	}

}
