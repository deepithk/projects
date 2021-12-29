package com.mindtree.stepDefinationSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationSteps {
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("I am on login page");
	}

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		System.out.println("I enter username as "+arg1+" and password as "+arg2);
	}

	@When("^I submit login page$")
	public void i_submit_login_page() throws Throwable {
		System.out.println("I submit login page");
	}

	@Then("^I redirect to user home page$")
	public void i_redirect_to_user_home_page() throws Throwable {
		System.out.println("I redirect to user home page");
	}
}