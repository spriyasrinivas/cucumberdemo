package org.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
public static void launchBrowser()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
}
public static  void loadUrl(String Url)
{
	driver.get(Url);
}
public static WebElement findingElement(String locator,String Value)
{
	if(locator.equals("id"))
	{
	WebElement element = driver.findElement(By.id(Value));
	return element;
}
	else if(locator.equals("name"))
	{
	WebElement element = driver.findElement(By.name(Value));
	return element;
}
	else if(locator.equals("xpath"))
	{
	WebElement element = driver.findElement(By.xpath(Value));
	return element;
}
	else
	{
		return null;
	}
}
public static void passValue(WebElement element,String value)
{
	element.sendKeys(value);
	element.sendKeys(Keys.ENTER);
}
public static void elementClick(WebElement element)
{
	element.click();
}
public static void dropDown(WebElement element,String Value)
{
	Select select = new Select(element);
	select.selectByVisibleText(Value);
}
public static void quitBrowser()
{
	driver.quit();
}
public static void takeScreenshot(File file) throws IOException {
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File screenshotas = screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotas,file);
}
public static void wHandles (int no)
{
	Set<String> noWindows=driver.getWindowHandles();
	List<String> wind = new ArrayList(noWindows);
	driver.switchTo().window(wind.get(no));
	
	
}
}