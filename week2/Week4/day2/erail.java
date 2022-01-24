package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement form = driver.findElement(By.id("txtStationFrom"));
		form.clear();
		form.sendKeys("ms");
		form.sendKeys(Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("mdu");
		to.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		int rowcount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
	List<String> trianNames=new ArrayList<String>();
		for (int i = 1; i <=rowcount ; i++) {
		String trianName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	trianNames.add(trianName);
		}
		Set<String>SetTrians=new LinkedHashSet<String>();
if (SetTrians != trianNames) {
	System.out.println("there have duplicatesNames");
} else {System.out.println("there not have duplicatesNames");

}
	}

}
