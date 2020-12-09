package pageobject_demosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_demo {
	WebDriver driver;

@FindBy(name="Email")
	@CacheLookup
    WebElement email;

@FindBy(name="Password")
@CacheLookup
WebElement password;

@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
@CacheLookup
WebElement submit_button;

@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
@CacheLookup
WebElement message1;

@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")
@CacheLookup
WebElement message2;

@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")
@CacheLookup
WebElement message3;




public void setemail(String semail) {
	email.sendKeys(semail);
}

public void setpassword(String spassword) {
	password.sendKeys(spassword);
}

public void setsubmit_button(){
	submit_button.click();
}




public WebElement getemail() {
	return email;
}

public WebElement getpassword() {
	return password;
}

public WebElement getsubmit_button(){
	return submit_button;
}
public String getmessage1() {
	return message1.getText();
}
public String getmessage2() {
	return message2.getText();
}
public String getmessage3() {
	return message3.getText();
}

//initiating Elements
		public login_demo(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}



}