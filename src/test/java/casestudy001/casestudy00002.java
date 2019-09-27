package casestudy001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy00002 {
	WebDriver driver=null;
	
	@Given("^login page is diplayed$")
	public void login_page_is_diplayed() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\browersdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		Thread.sleep(2000);
	    
	}

	@When("^user entesrrr \"([^\"]*)\" as username$")
	public void user_entesrrr_as_username(String string) throws Throwable {
		driver.findElement(By.id("userName")).sendKeys(string);
		Thread.sleep(2000);
	    
	}

	@When("^user enterrrr \"([^\"]*)\" as password$")
	public void user_enterrrr_as_password(String string) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@Then("^Succesfull Login$")
	public void succesfull_Login() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();;
		
	    
	}

}
