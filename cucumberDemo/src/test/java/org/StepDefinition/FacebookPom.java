package org.StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom extends BaseClass {
	FacebookPom()
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(id="email")
private WebElement userName;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;
public WebElement getuserName()
{
	return userName;
}
public WebElement getPassword()
{
	return password;
}
public WebElement getLogin()
{
	return login;
}
}
