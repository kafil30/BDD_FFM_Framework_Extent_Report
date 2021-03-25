package com.ffm.stepDefinitions;

import com.ffm.pages.FFM_OT_Member_Create_POM;
import com.ffm.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FFM_OT_Member_Creation_Steps extends TestBase{
	
	FFM_OT_Member_Create_POM createOTMember ;
		
		
	@Given("^I am on the FFM platform as a FFM OT admin$")
	public void i_am_on_the_FFM_platform_as_a_FFM_OT_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOTMember = new FFM_OT_Member_Create_POM();
		createOTMember.verifyFFMOTPlatform();
		
	}

	@When("^I click on the Add Super Admin span$")
	public void i_click_on_the_Add_Super_Admin_span() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOTMember.clickAddSuperAdminSpan();
		
	}

	@When("^I input the fields of OT member$") 
	public void i_input_the_fields_of_OT_member() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOTMember.registerOTmember("ABCD", "EFGH", "xyz@email.com", "123456");
	}
	
	@When("^I click on the register button$") 
	public void i_click_on_the_register_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		createOTMember.clickRegisterBtn();
	}

	@Then("^It should create a FFM OT member$")
	public void it_should_create_a_FFM_OT_member() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOTMember.verifyOTMemberListPage();
}
}