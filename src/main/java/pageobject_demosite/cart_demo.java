package pageobject_demosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_demo {
	WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="Email")
	@CacheLookup
    WebElement email;

   @FindBy(name="Password")
   @CacheLookup
   WebElement password;

    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    @CacheLookup
    WebElement submit_button;

	@FindBy(linkText="Books")
	@CacheLookup
	WebElement books;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	@CacheLookup
	WebElement add_to_cart;
	
	@FindBy(xpath="//*[@id='topcartlink']/a/span[1]")
	@CacheLookup
	WebElement cart;
	
	@FindBy(name="removefromcart")
	@CacheLookup
	WebElement remove;
	
	@FindBy(name="updatecart")
	@CacheLookup
	WebElement updatecart;
	
	

//step 2 : Setters
	public void setemail(String semail) {
		email.sendKeys(semail);
	}

	public void setpassword(String spassword) {
		password.sendKeys(spassword);
	}

	public void setsubmit_button(){
		submit_button.click();
	}

	public void setbooks() {
		books.click();
	}
	
	public void setadd_to_cart() {
		add_to_cart.click();
	}
	
	public void setcart() {
		cart.click();
	}
	
	public void setremove() {
		remove.click();
	}
		
		public void setupdatecart() {
			updatecart.click();
		}
	
	//step 3 : Getters
	public WebElement getemail() {
		return email;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement getsubmit_button(){
		return submit_button;
	}

	public WebElement getbooks(){
		return books;
	}
	public WebElement getadd_to_cart(){
		return add_to_cart;
	}
	public WebElement cart(){
		return cart;
	}
	public WebElement remove(){
		return remove;
	}
	public WebElement updatecart(){
		return updatecart;
	}

	//initiating Elements
			public cart_demo(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}

}
