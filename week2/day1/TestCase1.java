package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://Leaftaps.com/opentaps");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("sandeep");
	driver.findElement(By.id("lastNameField")).sendKeys("radhakrishnan");
	driver.findElement(By.className("smallSubmit")).click();
	String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	System.out.println(text);
	//String title=driver.getTitle();println(title);
	driver.close();
	
	}

}
