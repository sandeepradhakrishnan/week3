package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://Leaftaps.com/opentaps");
		driver.manage().window().maximize();
String title =driver.getTitle();
System.out.println(title);


	}

}
