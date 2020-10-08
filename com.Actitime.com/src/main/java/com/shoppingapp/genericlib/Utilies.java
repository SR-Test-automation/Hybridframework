package com.shoppingapp.genericlib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Utilies {
	public static void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public static void scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		
}
	
	public static void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public static void robot(int Keypressele,int keyreleaseele) 
	{
		try {
		Robot r=new Robot();
		r.keyPress(Keypressele);
		r.keyRelease(keyreleaseele);
		}
		catch(Exception e)
		{
			Reporter.log("robot class element not handled");
		}
		
	}

}
