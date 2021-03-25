package com.ffm.stepDefinitions;

import com.ffm.pages.FFM_Platform_Login_POM;
import com.ffm.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksSteps extends TestBase {
	FFM_Platform_Login_POM loginPOM;
	
	// Global Hooks
	@Before
	public void setup() {
		initializeDriver();
	}
	
	//Tagged Hook
	@Before("@AfterLogin")
	public void loginFFMOTMember() {
	loginPOM = new FFM_Platform_Login_POM();
	loginPOM.loginOTMember(prop.getProperty("email"), prop.getProperty("password"));
	loginPOM.clickLoginBtn();
		
	}

	@After
	public void tearDown() {
		
		try {
			Thread.sleep(4000);
		}	catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		}
	

}
