package Week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement selenium = driver.findElement(By.xpath("(//option[text()='Selenium'])[6]"));
WebElement LoadRunner = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"));
Actions builder=new Actions(driver);
builder.keyDown(Keys.CONTROL).click(selenium ).click(LoadRunner).keyUp(Keys.CONTROL).perform();
	}

}
