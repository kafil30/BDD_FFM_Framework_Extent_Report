 
package com.ffm.stepDefinitions;

import com.ffm.pages.FFM_Platform_Login_POM;
import com.ffm.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FFM_OT_Member_Login_Steps extends TestBase{
	FFM_Platform_Login_POM loginPOM;
	
	
	@Given("^I should able to view the login panel$")
	public void i_should_able_to_view_the_login_panel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //initializeDriver();
		loginPOM = new FFM_Platform_Login_POM();
		loginPOM.verifyLoginPage();
		
	}
	/*Regular Expressions
	 * 1. \"(.*)\"
	 * 2. \"([^\"]*)\"
	 */
	
	@When("^I should be able to give \"(.*)\" and \"(.*)\"$")
	public void i_should_be_able_to_give_email_and_password(String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		loginPOM.loginOTMember(email, password);
	
	}

	@When("^I should be able to click on the login button$") 
	public void i_should_be_able_to_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPOM.clickLoginBtn();
	}

	@Then("^I should be able to view the FFM platform$")
	public void i_should_be_able_to_view_the_FFM_platform() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am in the ffm platform");
	   
	}

}
