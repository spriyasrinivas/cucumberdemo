package org.stepdefinition1;

import org.StepDefinition.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePhone extends BaseClass {
	MobilePhone()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[contains(text(),'APPLE iPhone 14 (Blue, 128 GB)')]")
	private WebElement Applephone;
	public WebElement getApplephone()
	{
		return Applephone;
	}
	
@FindBy(xpath="//div[contains(text(),'POCO X5 Pro 5G (Astral Black, 256 GB)')]")
private WebElement Poco;
public WebElement getPoco()
{
	return Poco;
}
}
