package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {

	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	   
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	   
		driver.findElement(By.className("email")).sendKeys("rapoleraghu@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Raghu@1995");
		
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	
	

}
