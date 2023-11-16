package org.stepdefinition1;

import org.StepDefinition.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart extends BaseClass{
public 	AddTocart()
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//button[text()='Add to cart']")
private WebElement addCart;
public WebElement getaddCart()
{
	return addCart;
}
@FindBy(xpath="//button[text()='Add to cart']")
private WebElement addCart1;
public WebElement getaddCart1()
{
	return addCart1;
}
}
