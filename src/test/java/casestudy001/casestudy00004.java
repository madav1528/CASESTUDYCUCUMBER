package casestudy001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy00004 {
	WebDriver driver=null;
	@Given("^Alex has registerd to the testme app$")
	public void alex_has_registerd_to_the_testme_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\browersdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("madav333");
		driver.findElement(By.id("password")).sendKeys("madav321");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@When("^Alex search a particular product$")
	public void alex_search_a_particular_product() throws Throwable {
        driver.findElement(By.name("products")).sendKeys("bag");
		
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    
	}

	@When("^try to proceed to payment without adding any item$")
	public void try_to_proceed_to_payment_without_adding_any_item() throws Throwable {
	   try {
		   if(driver.findElement(By.xpath("//a[@href='displayCart.htm']")).isDisplayed()) {
			   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		   }
	   }
	   catch(Exception e)
	   {
		   System.out.println("No Cart hence no payment");
	   }
	}

	@Then("^Testmeapp didnt display any icon$")
	public void testmeapp_didnt_display_any_icon() throws Throwable {
	    
	}
}
