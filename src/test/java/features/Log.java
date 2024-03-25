package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Log {
	
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		WebElement u = driver.findElement(By.name("Email"));
	    u.sendKeys(string);
	    WebElement p = driver.findElement(By.name("Password"));
	    p.sendKeys(string2);
	}

	@Then("Keeping case as {string}")
	public void keeping_case_as(String string) {
		if (string.equalsIgnoreCase("Valid")) {
	        // Additional actions for valid case
	        System.out.println("Valid Credentials");    
	    } 
	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    System.out.println("Log in Successfully");
	}

	@Then("Keeping case as  invalid {string}")
	public void keeping_case_as_invalid(String string) {
		if (string.equalsIgnoreCase("Invalid")) {
	       
	        System.out.println("Valid Credentials");    
	    } 
	}


	@Then("user will be asked to go back to login page")
	public void user_will_be_asked_to_go_back_to_login_page() {
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	}

	@Then("Provide correct credentials")
	public void provide_correct_credentials() {
	   System.out.println("Provide correct credentials");
	}



}
