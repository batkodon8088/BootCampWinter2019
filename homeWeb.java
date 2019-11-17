package POM;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeWeb
{
		public WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"SPSORegister\"]/a/span")
		WebElement clickRegister;
		
		@FindBy(id="email")
		WebElement emailfeild;
		
		
		@FindBy(id="password-input-field")
		WebElement passwordfeild;
		
		@FindBy(id="zipCode")
		WebElement zipCodeFeild;
		
		@FindBy(id="phone")
		WebElement phoneNumberFeild;
		
		@FindBy(linkText="Create an Account")
		WebElement createAccount;
	// This is the connection to the global variable to the local variable
		public homeWeb(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickRegister() {
			clickRegister.click();
		}
		
		public void emailfeild(String email) {
			emailfeild.sendKeys(email);
		}
		public void passwordfeild(String password) {
			passwordfeild.sendKeys(password);
		}
		public void zipCodeFeild(String zipcode) {
			zipCodeFeild.sendKeys(zipcode);
		}

		public void phoneNumberFeild(String phone) {
			phoneNumberFeild.sendKeys(phone);	
		}
		public void zipCodeFeild() {
			zipCodeFeild.click();	
		}

		public void createAccount() {
			createAccount.click();
}
		
		
		

	
}
