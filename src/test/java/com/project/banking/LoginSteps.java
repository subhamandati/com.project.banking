package com.project.banking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^I visit home page$")
	public void i_visit_home_page() throws Throwable {
	   System.out.println("I am on Home Page");
	}

	@When("^I login to application$")
	public void i_login_to_application() throws Throwable {
	   System.out.println("Login Details");
	}

	@Then("^I Should see Inbox$")
	public void i_Should_see_Inbox() throws Throwable {
	   System.out.println("I am in Inbox page");
	}
	
}
