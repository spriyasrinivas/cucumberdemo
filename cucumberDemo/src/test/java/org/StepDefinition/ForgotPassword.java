package org.StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword extends BaseClass {
ForgotPassword()
{
 PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='Forgot password?']")
private WebElement forgotpassword;
public WebElement getforpassword()
{
	return forgotpassword;
}
@FindBy(xpath="//a[text()='Try again']")
private WebElement tryAgain;
public WebElement getTry()
{
	return tryAgain;
}
@FindBy(xpath="//input[@placeholder='Email or mobile number']")
private WebElement mobileNo;
public WebElement getmobileNo()
{
	return mobileNo;
}
@FindBy(xpath="//button[text()='Search']")
private WebElement search;
public WebElement getSearch()
{
	return search;
}
}
