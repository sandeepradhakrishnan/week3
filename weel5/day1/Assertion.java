package weel5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
@Test
	
public void login() {
		String title=" opentaps CRM";
		WebDriverManager.chromedriver().setup();

	   ChromeDriver driver  = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url="http://leaftaps.com/opentaps/control/login";
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals(title1, title);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title1, title);
		System.out.println("Anith");
		sa.assertAll();
		
	

}
}
