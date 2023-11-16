package org.stepdefinition1;

import org.StepDefinition.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPom extends BaseClass {
	public SearchPom()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private WebElement searchTab;
	public WebElement getSearchtab()
	{
		return searchTab;
	}

}
