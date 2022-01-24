package Week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
WebElement product = driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
product.sendKeys("L'Oreal Paris");
driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
System.out.println("L'Oreal Paris");
driver.findElement(By.className("sort-name")).click();
driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
driver.findElement(By.xpath("//div[@class='filter-open css-nbw8dp']")).click();
driver.findElement(By.xpath("(//span[@class='side-count'])[1]")).click();
driver.findElement(By.xpath("(//span[@class='side-count'])[2]")).click();
driver.findElement(By.xpath("//label[@class='control control-checkbox']//div[@class='control-indicator checkbox ']")).click();
driver.findElement(By.xpath("//span[text()='Concern']")).click();
driver.findElement(By.xpath("//span[text()='Color Protection']/following::div")).click();
driver.findElement(By.xpath("(//div[@class='css-43m2vm'])[1]")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String>handles=new ArrayList<String>(windowHandles);
driver.switchTo().window(handles.get(1));
WebElement drop = driver.findElement(By.xpath("//select[@class='css-18yinz8']"));
Select dropd=new Select(drop);
dropd.selectByIndex(0);
System.out.println("150");
driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
driver.switchTo().frame(0);
driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
driver.switchTo().window(handles.get(2));
driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
driver.quit();
	}

}
