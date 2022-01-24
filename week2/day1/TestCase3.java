package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://Leaftaps.com/opentaps");
		driver.manage().window().maximize();
String title =driver.getTitle();
System.out.println(title);
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandeep");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Radhakrishnan");
WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select select = new Select(ele);
select.selectByVisibleText("Employee");
WebElement Fe = driver.findElement(By.name("marketingCampaignId"));
Select Market=new Select(Fe);
Market.selectByVisibleText("Automobile");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/21/2000");
WebElement Dd = driver.findElement(By.name("industryEnumId"));
Select Indu=new Select(Dd);
Indu.selectByVisibleText("Computer Software");

	

	}

}
