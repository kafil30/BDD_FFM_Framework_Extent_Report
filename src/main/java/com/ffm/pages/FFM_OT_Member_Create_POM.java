package com.ffm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ffm.utils.TestBase;

public class FFM_OT_Member_Create_POM extends TestBase {
	
	
	//Add super admin span webelement
		@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")
		WebElement addSuperAdminSpanElement;
		
		//FirstName Field
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/input")
		WebElement firstNameFieldElement;
		
		//LastName Field 
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/input")
		WebElement lastNameFieldElement;
		
		//Email Field
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[3]/input")   
		WebElement emailFieldElement;
		
		//Password Field
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[4]/input")
		WebElement passwowdFieldElement;
		
		//Register Button
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/button")
		WebElement registerButtonElement;
		
		//OT member list title
		@FindBy(xpath ="//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3")
		WebElement otMemberListTitleElement;
		
		
		//Initialize the element, Parameterized Constructor
		public FFM_OT_Member_Create_POM() {
			
			PageFactory.initElements(driver, this);
		}
		
		//Click on the add super admin span, methods
		public void clickAddSuperAdminSpan() {
			
			addSuperAdminSpanElement.click();
		}
		
		//Input the fields
		public void registerOTmember(String firstname, String lastname, String email, String password) {
			firstNameFieldElement.sendKeys(firstname);
			lastNameFieldElement.sendKeys(lastname);
			emailFieldElement.sendKeys(email);
			passwowdFieldElement.sendKeys(password);
			registerButtonElement.click();
			
		}
		
		//Click on the Register Button
		public void clickRegisterBtn() {
			registerButtonElement.click();
		}
		//Verify the OT member page
		public void verifyOTMemberListPage() {
			otMemberListTitleElement.isEnabled();
		}
		
		public void verifyFFMOTPlatform() {
			addSuperAdminSpanElement.isEnabled();
			
			
		}
}
