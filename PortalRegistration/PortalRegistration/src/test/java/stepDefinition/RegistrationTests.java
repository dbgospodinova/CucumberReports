package stepDefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationTests {
	WebDriver driver;

	@Given("^Open Chrome and start portal$")
	public void open_Chrome_and_start_portal() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/diana.gospodinova/Desktop/Selenium_Cucumber/NewJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mcl.portal.qa.miracl.net/");
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
		driver.findElement(By.xpath("//a[@class='btn btn-tertiary']")).click();
		driver.findElement(By.xpath("//input[@id='forename']")).sendKeys("Behave");
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Pro");
		driver.findElement(By.xpath("//input[@id='company123']")).sendKeys("Miracl");
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("test_behavepro@mailinator.com");
		Select select = new Select(driver.findElement(By.tagName("select")));
		select.selectByVisibleText("Bulgaria");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
	}

	@Then("^User should be able to register$")
	public void user_should_be_able_to_register() throws Throwable {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath("//a[@class='cancel_btn']")).click();
				driver.close(); // closing child window

			}
		}

	}

	@When("^I enter invalid credentials$")
	public void i_enter_invalid_credentials() throws Throwable {
		driver.findElement(By.xpath("//a[@class='btn btn-tertiary']")).click();
		driver.findElement(By.xpath("//input[@id='forename']")).sendKeys("Behave");
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Pro");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Miracl");
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("test_behavepro");
		Select select = new Select(driver.findElement(By.tagName("select")));
		select.selectByVisibleText("Bulgaria");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();

	}

	@Then("^User should not be able to register$")
	public void user_should_not_be_able_to_register() throws Throwable {
		driver.close();
	}
}
