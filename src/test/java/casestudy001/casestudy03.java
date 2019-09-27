package casestudy001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy03 {
	WebDriver driver=null;
	
	@Given("^user login to the app using login$")
	public void user_login_to_the_app_using_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\browersdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("madav333");
		driver.findElement(By.id("password")).sendKeys("madav321");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("^Types heads$")
	public void types_heads() throws Throwable {
		 driver.findElement(By.name("products")).sendKeys("bag");
			
			driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
		
	    
	}

	@Then("^the products suggestion is displays$")
	public void the_products_suggestion_is_displays() throws Throwable {
	    
	}

}
