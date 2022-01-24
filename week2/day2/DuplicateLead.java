package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://Leaftaps.com/opentaps");
		driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Email")).click();
driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//a[@id='ext-gen880']")).click();
driver.findElement(By.linkText("Duplicate")).click();



	}

}
