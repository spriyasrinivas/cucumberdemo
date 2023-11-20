package org.hooks;

import java.io.File;
import java.io.IOException;

import org.StepDefinition.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookProject extends BaseClass{
	@Before
	public void before()
	{
		launchBrowser();
		loadUrl("https://www.amazon.com/");
	} 
	@After
	public void after() throws IOException
	{
	takeScreenshot(new File("C:\\Users\\Success\\eclipse-workspace\\Mavenfacebook\\target\\flipkart.png"));
	quitBrowser();
	}

}
