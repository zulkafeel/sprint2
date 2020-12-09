package pageobject_demosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_demo {
	WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(id="gender-male")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="FirstName")
	@CacheLookup
	WebElement fname;
	
	@FindBy(name="LastName")
	@CacheLookup
	WebElement lname;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;

	@FindBy(name="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="ConfirmPassword")
	@CacheLookup
	WebElement confirm_password;
	
	@FindBy(name="register-button")
	@CacheLookup
	WebElement register_button;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/span[2]/span")
	@CacheLookup
	WebElement message1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/span[2]/span")
	@CacheLookup
	WebElement message2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")
	@CacheLookup
	WebElement message3;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")
	@CacheLookup
	WebElement message4;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")
	@CacheLookup
	WebElement message5;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")
	@CacheLookup
	WebElement message6;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")
	@CacheLookup
	WebElement message7;
	
	//step 2 : Setters
	public void setgender() {
		gender.click();
	}
	
	public void setfname(String sfname) {
		fname.sendKeys(sfname);
	}
	
	public void setlname(String slname) {
		lname.sendKeys(slname);
	}
	
	public void setemail(String semail) {
		email.sendKeys(semail);
	}
	
	public void setpassword(String spassword) {
		password.sendKeys(spassword);
	}
	
	public void setconfirm_password(String sconfirm_password) {
		confirm_password.sendKeys(sconfirm_password);
	}

	public void setregister_button() {
		register_button.click();
	}
	
	
	
	//Step 3 : getters
	public WebElement getgender(){
		return gender;
	}
		public WebElement getfname() {
			return fname;
		}
		
		public WebElement getlname() {
			return lname;
		}
		
		public WebElement getemail() {
			return email;
		}
		
		public WebElement getpassword() {
			return password;
		}
		
		public WebElement getconfirm_password() {
			return confirm_password;
		}
		
		public WebElement register_button() {
			return register_button;
		}
		
		public String getmessage1() {
			return(message1.getText()) ;
		}
		
		public String getmessage2() {
			return(message2.getText()) ;
		}
		public String getmessage3() {
			return(message3.getText()) ;
		}
		public String getmessage4() {
			return(message4.getText()) ;
		}
		public String getmessage5() {
			return(message5.getText()) ;
		}
		public String getmessage6() {
			return(message6.getText()) ;
		}
		public String getmessage7() {
			return(message7.getText()) ;
		}

		//initiating Elements
		public register_demo(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

} 

	
	

	
	
	
