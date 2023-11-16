package org.StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
WebDriver driver;
PageManager manager;
@Given("User is on FacebookLogin Page.")
public void LaunchFb()
{
	launchBrowser();
	loadUrl("https://www.facebook.com/");
}

@When("Users enter UserName and Password")
public void aa()
{
	FacebookPom face = new FacebookPom();
	passValue(face.getuserName(),"priya");
	passValue(face.getPassword(),"123456");
	
}
@When("Users enter UserName as {string} and Password {string}")
public void users_enter_user_name_as_and_password(String string, String string2) {
	FacebookPom face = new FacebookPom();
	passValue(face.getuserName(),string);
	passValue(face.getPassword(),string2);
}

@When("Users enter UserName and Password using 1D table")
public void users_enter_user_name_and_password_using_1d_table(io.cucumber.datatable.DataTable dataTable) {
    List<String> list = dataTable.asList();
    FacebookPom face = new FacebookPom();
    passValue(face.getuserName(),list.get(0));
	passValue(face.getPassword(),list.get(2));
}
@When("Users enter UserName and Password using 1D table with heading")
public void users_enter_user_name_and_password_using_1d_table_with_heading(io.cucumber.datatable.DataTable dataTable) {
    Map<String,String> map=dataTable.asMap();
    FacebookPom face = new FacebookPom();
    passValue(face.getuserName(),map.get("Username"));
	passValue(face.getPassword(),map.get("Username1"));
}




@Then("Users Login button")
public void bb()
{
	FacebookPom face = new FacebookPom();
	elementClick(face.getLogin());
}
@Given("click forgot password")
public void click_forgot_password() {
	ForgotPassword forgot = new ForgotPassword();
    elementClick(forgot.getforpassword());
}
@When("click Tryagain button")
public void click_tryagain_button() {
	ForgotPassword forgot = new ForgotPassword();
    elementClick(forgot.getTry());
}
@When("enter the mobile number")
public void enter_the_mobile_number() {
	ForgotPassword forgot = new ForgotPassword();
	passValue(forgot.getmobileNo(),"6453267436");
    elementClick(forgot.getSearch());
}
@Then("validate the mobile number")
public void validate_the_mobile_number() {
	ForgotPassword forgot = new ForgotPassword();
	elementClick(forgot.getSearch());
}
@Given("Click create Account")
public void click_create_account() {
	loadUrl("https://www.facebook.com/");
	CreateAccount create = new CreateAccount();
	elementClick(create.getcreateAccount());
    
}
@When("Enter the details")
public void enter_the_details() {
	CreateAccount create = new CreateAccount();
	
}
@Then("create the account")
public void create_the_account() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Test
public void quit ()
{
	quitBrowser();
}


}
