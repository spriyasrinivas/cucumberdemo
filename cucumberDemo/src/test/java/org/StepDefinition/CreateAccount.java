package org.StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends BaseClass {
	CreateAccount()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createAccount;
	public WebElement getcreateAccount()
	{
		return  createAccount;
	}
	@FindBy(name="firstname")
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	@FindBy(name="firstname")
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	

}
