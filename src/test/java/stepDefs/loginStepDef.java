package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStepDef {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	   
	}

	@When("User enter login credentials")
	public void user_enter_login_credentials() {
	    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
	    driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.cssSelector(".radius")).click();
	}

	@Then("Should display succcess msg")
	public void should_display_succcess_msg() {
	    boolean isDisp = driver.findElement(By.className("success")).isDisplayed();
	    Assert.assertTrue(isDisp);
	   // Assert.assertFalse(isDisp);// to make fail
	    driver.quit();
	}

}
