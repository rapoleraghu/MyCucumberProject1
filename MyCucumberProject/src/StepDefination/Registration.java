package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {

	WebDriver driver;
	
	@Given("^open registration page$")
	public void open_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
	}

	@When("^I enter valid new user information$")
	public void i_enter_valid_new_user_information() throws Throwable {
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("vasi");
		driver.findElement(By.id("LastName")).sendKeys("vasi");
		driver.findElement(By.id("Email")).sendKeys("vasi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("vasi@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("vasi@1234");
	}

	@Then("^User should be able to register$")
	public void user_should_be_able_to_register() throws Throwable {
		driver.findElement(By.id("register-button")).click();
	}

	
}
