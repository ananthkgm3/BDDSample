package stepDefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartLoginStepDef {
	WebDriver driver;

	@When("User is on opencart login page")
	public void user_is_on_opencart_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php");
	}
	@When("User navigates to login page")
	public void user_navigates_to_login_page() {
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
//	@Given("User login with credentials")
//	public void user_login_with_credentials() {
//	    driver.findElement(By.name("email")).sendKeys("firstlast07@gmail.com");
//	    driver.findElement(By.name("password")).sendKeys("Test@123");
//	    driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
	
	@Given("User login with {string} and {string}")
	public void user_login_with_and(String strUser, String strPwd) {
		driver.findElement(By.name("email")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(strPwd);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}


//	@Given("User login with credentials")  // DataTable as  list
//	public void user_login_with_credentials(io.cucumber.datatable.DataTable dataTable) {
//	    List<List<String>> user = dataTable.asLists();
//	    driver.findElement(By.name("email")).sendKeys(user.get(0).get(0));
//	    driver.findElement(By.name("password")).sendKeys(user.get(0).get(1));
//	    driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
	
	@Given("User login with credentials")  // DataTable as  Map
	public void user_login_with_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> user = dataTable.asMaps();
		String strUser = user.get(0).get("email");
		String strPwd = user.get(0).get("pwd");
		driver.findElement(By.name("email")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(strPwd);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Then("User search item")
	public void user_search_item(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> itemList = dataTable.asLists();
		driver.findElement(By.name("search")).sendKeys(itemList.get(0).get(0));
		driver.findElement(By.cssSelector("span.input-group-btn")).click();
	}




	@Then("User navigates to My Account page")
	public void user_navigates_to_my_account_page() {
		Assert.assertEquals(driver.getTitle(), "My Account");
		//driver.quit();
	    
	}
	
	@Then("Should display error msg")
	public void should_display_error_msg() {
	    boolean isDisp = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
	    Assert.assertTrue(isDisp);
	    driver.quit();
	}



	

}
