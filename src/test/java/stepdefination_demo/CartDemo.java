package stepdefination_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject_demosite.cart_demo;

public class CartDemo {
	WebDriver driver;
	cart_demo objcart;
	
	@Given("^user should be on the home page of the website$")
	public void user_should_be_on_the_home_page_of_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objcart = new cart_demo(driver);
		objcart = PageFactory.initElements(driver,cart_demo.class);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		objcart.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objcart.setpassword("Aeiouare5"); Thread.sleep(1000);
		objcart.setsubmit_button(); Thread.sleep(1000);
	}

	@Then("^user should select a product and add it to the cart$")
	public void user_should_select_a_product_and_add_it_to_the_cart() throws Throwable {
	    objcart.setbooks(); Thread.sleep(500);
	    objcart.setadd_to_cart(); Thread.sleep(2000);
	    
	}

	@Then("^products should reflect in the cart$")
	public void products_should_reflect_in_the_cart() throws Throwable {
		driver.navigate().to("http://demowebshop.tricentis.com/cart");
	    objcart.setcart(); Thread.sleep(500);
	}

	@Given("^user should have some products in the cart$")
	public void user_should_have_some_products_in_the_cart() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		objcart = new cart_demo(driver);
		objcart = PageFactory.initElements(driver,cart_demo.class);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		objcart.setemail("zulkafeel899@gmail.com");	Thread.sleep(1000);
		objcart.setpassword("Aeiouare5"); Thread.sleep(1000);
		objcart.setsubmit_button(); Thread.sleep(3000);
	}

	@When("^user clicks on Shopping cart button$")
	public void user_clicks_on_Shopping_cart_button() throws Throwable {
		driver.navigate().to("http://demowebshop.tricentis.com/cart");
		objcart.setcart(); Thread.sleep(1000);
	}

	@Then("^user should select the products that are to be removed$")
	public void user_should_select_the_products_that_are_to_be_removed() throws Throwable {
	    objcart.setremove();Thread.sleep(1000);
	}

	@Then("^click on update shopping cart button$")
	public void click_on_update_shopping_cart_button() throws Throwable {
	    objcart.setupdatecart();Thread.sleep(900);
	}



}
