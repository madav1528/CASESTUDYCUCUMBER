package casestudy001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy00001 {
	WebDriver driver = null;
	@Given("^the signup page is opened$")
	public void the_signup_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\browersdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();
		Thread.sleep(2000);
	   
	}

	@When("^user entes \"([^\"]*)\" as username$")
	public void user_entes_as_username(String string) throws Throwable {
		driver.findElement(By.id("userName")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@When("^user entrs \"([^\"]*)\" as firstname$")
	public void user_entrs_as_firstname(String string) throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys(string);
		Thread.sleep(2000);
	    
	}

	@When("^user entrs \"([^\"]*)\" as lastname$")
	public void user_entrs_as_lastname(String string) throws Throwable {
		driver.findElement(By.id("lastName")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@When("^user eners \"([^\"]*)\" as password$")
	public void user_eners_as_password(String string) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(string);
		Thread.sleep(2000);
	    
	}

	@When("^user entes \"([^\"]*)\" as conpassword$")
	public void user_entes_as_conpassword(String string) throws Throwable {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@When("^Select male$")
	public void select_male() throws Throwable {
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		radio1.click();
		Thread.sleep(2000);
		
	    
	}

	@When("^user eners \"([^\"]*)\" as email$")
	public void user_eners_as_email(String string) throws Throwable {
		
		driver.findElement(By.id("emailAddress")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("^user eners \"([^\"]*)\" as mobile$")
	public void user_eners_as_mobile(String string) throws Throwable {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("^user entrs \"([^\"]*)\" as dob$")
	public void user_entrs_as_dob(String string) throws Throwable {
		driver.findElement(By.id("dob")).sendKeys(string);
		Thread.sleep(2000);
	}
	@When("^user ents \"([^\"]*)\" as address$")
	public void user_ents_as_address(String string) throws Throwable {
		driver.findElement(By.id("address")).sendKeys(string);
		Thread.sleep(2000);
		
	}
	@When("^Select secque$")
	public void select_secque() throws Throwable {
		Select from=new Select(driver.findElement(By.name("securityQuestion")));
				from.selectByIndex(1);
				Thread.sleep(2000);
		
	   
	}

	@When("^user entr \"([^\"]*)\" as answer$")
	public void user_entr_as_answer(String string) throws Throwable {
		
		driver.findElement(By.id("answer")).sendKeys(string); 
		Thread.sleep(2000);
	}

	@When("^user Clicks Register$")
	public void user_Clicks_Register() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click(); 
		
		Thread.sleep(2000);
	}

	@Then("^Registers Successfully$")
	public void registers_Successfully() throws Throwable {
	    System.out.println("Title of the page is "+driver.getTitle());
	}


}
