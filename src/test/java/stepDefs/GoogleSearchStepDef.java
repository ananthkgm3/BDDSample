package stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStepDef {
	WebDriver driver;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@When("User enters Java Tutorial")
	public void user_enters_java_tutorial() {
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Java Tutorial");
		searchbox.submit();
	}
	@Then("Should display Java result Page")
	public void should_display_java_result_page() {
		org.junit.Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		driver.close();
	}
	

	@When("User enters Selenium Tutorial")
	public void user_enters_selenium_tutorial() {
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Selenium Tutorial");
		searchbox.submit();
	}
	@Then("Should display Selenium result Page")
	public void should_display_selenium_result_page() {
		org.junit.Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
		driver.close();
	}
	
//	@After
//	public void generateScreenshot(Scenario scenario) throws IOException{
//		if(scenario.isFailed()) {
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File file = screen.getScreenshotAs(OutputType.FILE);
//			byte[] imgByte = FileUtils.readFileToByteArray(file);
//			scenario.attach(imgByte, "image/png", "image1");
//			
//		}
//	}







}
