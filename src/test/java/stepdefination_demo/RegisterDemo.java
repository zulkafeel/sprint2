package stepdefination_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject_demosite.register_demo;


public class RegisterDemo {
	WebDriver driver;
	register_demo objhbpg;

	
	@Given("^User is on the Register page$")
	public void user_is_on_the_Register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objhbpg = new register_demo(driver);
		objhbpg = PageFactory.initElements(driver,register_demo.class);
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^User enters valid data$")
	public void user_enters_valid_data() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objhbpg.setregister_button(); Thread.sleep(5000);
		
	}
// to click on continue button after successful registration
	@Then("^User is redirected to registration completed page$")
	public void user_is_redirected_to_registration_completed_page() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		Thread.sleep(3000);
	}

	//for invalid data
	
	@When("^user leaves first Name field blank$")
	public void user_leaves_first_Name_field_blank() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
 
	}
//	@When("^clicks the button$")
//	public void clicks_the_button() throws InterruptedException {
//		objhbpg.setregister_button(); Thread.sleep(1000);
//		driver.close();
//	}
	
	// unsuccessful registration firstname blank
	@Then("^display firstname alert message$")
	public void display_firstname_alert_message() throws Throwable {
		String actual1 = objhbpg.getmessage1();
	    String expected1 = "First name is required.";
		Assert.assertEquals(expected1,actual1);
	}

	@When("^user leaves last Name field blank$")
	public void user_leaves_last_Name_field_blank() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
		//objhbpg.setregister_button(); Thread.sleep(1000);
		}
	@Then("^display lastname alert message$")
	public void display_lastname_alert_message() throws Throwable {
		String actual2 = objhbpg.getmessage2();
	    String expected2 = "Last name is required.";
		Assert.assertEquals(expected2,actual2);
	}


	@When("^user leaves the email field blank$")
	public void user_leaves_the_email_field_blank() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
		//objhbpg.setregister_button(); Thread.sleep(1000);
	}
	@Then("^display email alert message$")
	public void display_email_alert_message() throws Throwable {
		String actual3 = objhbpg.getmessage3();
	    String expected3 = "Email is required.";
		Assert.assertEquals(expected3,actual3);
	}
//
//
	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel@.com");	Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
		//objhbpg.setregister_button(); Thread.sleep(1000);
	}

	@When("^user enters incorrect email format$")
	public void user_enters_incorrect_email_format() throws Throwable {
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);

  }
	@Then("^display  email formate alert message$")
	public void display_email_formate_alert_message() throws Throwable {
		String actual4 = objhbpg.getmessage6();
	    String expected4 = "Wrong email";
		Assert.assertEquals(expected4,actual4);
	}
//
//
	@Given("^user should be on the registration page$")
	public void user_is_on_the_Register_page1() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objhbpg = new register_demo(driver);
		objhbpg = PageFactory.initElements(driver,register_demo.class);
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user leaves password field blank$")
	public void user_leaves_password_field_blank() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword(""); Thread.sleep(1000);
		objhbpg.setconfirm_password("Aeiouare5"); Thread.sleep(1000);
		//objhbpg.setregister_button(); Thread.sleep(1000);
		
	}
	@Then("^display password alert message$")
	public void display_password_alert_message() throws Throwable {
		String actual4 = objhbpg.getmessage4();
	    String expected4 = "Password is required.";
		Assert.assertEquals(expected4,actual4);
	}
//
//
	@When("^user enters incorrect password format$")
	public void user_enters_incorrect_password_format() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("123"); Thread.sleep(1000);
		objhbpg.setconfirm_password("123"); Thread.sleep(1000);
		objhbpg.setregister_button(); Thread.sleep(1000);
	}
	@Then("^display password formate alert message$")
	public void display_password_formate_alert_message() throws Throwable {
		String actual5 = objhbpg.getmessage6();
	    String expected5 = "The password should have at least 6 characters.";
		Assert.assertEquals(expected5,actual5);
	}
//
//
	@When("^user leaves confirm password field blank$")
	public void user_leaves_confirm_password_field_blank() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password(""); Thread.sleep(1000);
		objhbpg.setregister_button(); Thread.sleep(1000);
	}
	@Then("^display confirm password alert message$")
	public void display_confirm_password_alert_message() throws Throwable {
		String actual6 = objhbpg.getmessage4();
	    String expected6 = "Password is required.";
		Assert.assertEquals(expected6,actual6);
	}
//
//
	@When("^user enters mismatched password in the confirm password field$")
	public void user_enters_mismatched_password_in_the_confirm_password_field() throws Throwable {
		objhbpg.setgender(); Thread.sleep(1000);
		objhbpg.setfname("kafeel");	Thread.sleep(1000);
		objhbpg.setlname("ur rahiman");	Thread.sleep(1000);
		objhbpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objhbpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objhbpg.setconfirm_password("AeiouARE5"); Thread.sleep(1000);
		objhbpg.setregister_button(); Thread.sleep(1000);
	}
	@Then("^display password mismatch alert message$")
	public void display_password_mismatch_alert_message() throws Throwable {
		String actual7 = objhbpg.getmessage7();
	    String expected7 = "The password and confirmation password do not match.";
		Assert.assertEquals(expected7,actual7);
	}




}
