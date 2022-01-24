package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://Leaftaps.com/opentaps");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("sandeep");
driver.findElement(By.id("lastNameField")).sendKeys("radhakrishnan");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sandy");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("nani");
driver.findElement(By.name("departmentName")).sendKeys("BCOM");
driver.findElement(By.name("description")).sendKeys("all is well");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sandeep@gmail.com");
WebElement Ele = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
Select Country=new Select(Ele);
Country.selectByVisibleText("India");
driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("pratices make an man prefect");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
String title=driver.getTitle();
System.out.println(title);

	}

}
