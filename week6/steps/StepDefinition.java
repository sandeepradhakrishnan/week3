package steps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class StepDefinition extends AbstractTestNGCucumberTests{
    
	public ChromeDriver driver;
	@Given ("Open The chromeBrowser")
	public void OpenBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@And ("Load the url application") 
	public void Openurl()
	{
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	@And ("Enter THe username as {string}")
	public void username(String Uname)
	{
		driver.findElement(By.id("username")).sendKeys(Uname);
		
		
		
	}
	@And ("enter the password as {string}")
	public void Password(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When ("Click on login button") 
	public void LoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then ("Homepage should be loaded and displayed") 
	public void Homepage()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
		
	
@But ("Error msg should displayed")
public void Errormsg1()
{
	System.out.println("error page");
}
	}


