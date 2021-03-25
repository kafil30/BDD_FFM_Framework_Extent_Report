package com.ffm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ffm.utils.TestBase;

public class FFM_Platform_Login_POM extends TestBase {
		
		//Email Field
		@FindBy(id = "login")
		WebElement emailFieldElement; 
		
		//Password Field
		@FindBy(id = "password")
		WebElement passFieldElement;
		
		//Login Button	
		@FindBy(xpath = "//*[@id=\"formContent\"]/form/input[3]")
		WebElement loginButtonElement;
			
		//FFM Login panel header
		@FindBy(xpath = "//*[@id=\"formContent\"]/div/h3")
		WebElement loginPanelHeaderElement;
		
		//Constructor of this login POM class (Parameterized Constructor) 
		public FFM_Platform_Login_POM() {
			
			
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);//Driver inherit from TestBase Class
		
		} 
		
		//Login as a FFM OT Member and Parameterize the method, email and password came from properties
		public void loginOTMember(String email, String password) {
			emailFieldElement.sendKeys("email");
			passFieldElement.sendKeys("password");
			
			}

		public void clickLoginBtn() {
			loginButtonElement.click();
			
		}

		public void verifyLoginPage() {
			loginPanelHeaderElement.isEnabled();
			
			
	
			
		}

						
				
}
