package week2.day2;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
driver.findElement(By.xpath("//*[@id=\"u_2_b_VV\"]")).sendKeys("sandeep");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("radhakrishnan");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sandeepradhakrishna213@gmail.com");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sandeep@213");


WebElement Ele = driver.findElement(By.id("day"));
Select Facebook=new Select(Ele);
Facebook.selectByIndex(21);

WebElement Find = driver.findElement(By.id("month"));
Select Face=new Select(Find);
Face.selectByIndex(9);

WebElement Fe = driver.findElement(By.id("year"));
Select Book=new Select(Fe);
Book.selectByIndex(2000);
driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[1]"));
	}

}
