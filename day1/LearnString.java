package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnString {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("voice of unity");
	driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
driver.findElement(By.xpath("//img[@id='img']")).click();
}


	}


