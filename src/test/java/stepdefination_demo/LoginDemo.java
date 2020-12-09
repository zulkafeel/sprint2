package stepdefination_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject_demosite.login_demo;

public class LoginDemo {
	WebDriver driver;
	login_demo objlgpg;
	
	@Given("^user should be on the login page$")
	public void user_should_be_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objlgpg = new login_demo(driver);
		objlgpg = PageFactory.initElements(driver,login_demo.class);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
	}

	@When("^user enters the valid username and password and clicks on sign in$")
	public void user_enters_the_valid_username_and_password_and_clicks_on_sign_in() throws Throwable {
		objlgpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objlgpg.setpassword("Aeiouare5"); Thread.sleep(1000);
		objlgpg.setsubmit_button(); Thread.sleep(1000);
	}

	@Then("^user should be redirected to home page of the website$")
	public void user_should_be_redirected_to_home_page_of_the_website() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/");
		driver.close();
	}

	@Given("^user is on the login page of WebDemoPage$")
	public void user_is_on_the_login_page_of_WebDemoPage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objlgpg = new login_demo(driver);
		objlgpg = PageFactory.initElements(driver,login_demo.class);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
	}

	@When("^user enters  and  fields$")
	public void user_enters_and_fields() throws Throwable {
		objlgpg.setemail("");	Thread.sleep(1000);
		objlgpg.setpassword(""); Thread.sleep(1000);
		

	}

	@When("^clicks on sign in button$")
	public void clicks_on_sign_in_button() throws Throwable {
		objlgpg.setsubmit_button(); Thread.sleep(1000);
		
	}

	@Then("^displays alert message$")
	public void displays_alert_message() throws Throwable {
		String actual1 = objlgpg.getmessage1();
		String actual2 = objlgpg.getmessage2();
	    String expected1 = "Login was unsuccessful. Please correct the errors and try again.";
	    String expected2 = "No customer account found";
		Assert.assertEquals(expected1,actual1);
		Assert.assertEquals(expected2,actual2);
		driver.close();
	}

	@When("^user enters  and Aeiouare@(\\d+) fields$")
	public void user_enters_and_Aeiouare_fields(int arg1) throws Throwable {
		objlgpg.setemail("");	Thread.sleep(1000);
		objlgpg.setpassword("Aeiouare@5"); Thread.sleep(1000);
		
	}

	@When("^user enters abcdxyz(\\d+)@gmail\\.com and  fields$")
	public void user_enters_abcdxyz_gmail_com_and_fields(int arg1) throws Throwable {
		objlgpg.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objlgpg.setpassword(""); Thread.sleep(1000);
//		objlgpg.setsubmit_button(); Thread.sleep(2000);
//		
//		String actual1 = objlgpg.getmessage1();
//		String expected1 = "Login was unsuccessful. Please correct the errors and try again.";
//		Assert.assertEquals(expected1,actual1);
//		String actual3 = objlgpg.getmessage3();
//		String expected3 = "The credentials provided are incorrect";
//		Assert.assertEquals(expected3,actual3);
	}

	@When("^user enters abcdxyz(\\d+)@gmail\\.com and Aeiouare@(\\d+) fields$")
	public void user_enters_abcdxyz_gmail_com_and_Aeiouare_fields(int arg1, int arg2) throws Throwable {
		objlgpg.setemail("arlkjsfncm@gmail.com");	Thread.sleep(1000);
		objlgpg.setpassword("OWEILDKUH"); Thread.sleep(1000);
		
	}



}
