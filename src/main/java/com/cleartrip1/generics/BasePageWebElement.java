package com.cleartrip1.generics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePageWebElement
{
	// WebElement  
		
		public String text(WebElement ele)
		{
			String text = ele.getText();
			System.out.println(text);
			return text;
		}
		public Point location(WebElement ele)
		{
			Point loc = ele.getLocation();
			System.out.println(loc);
			return loc;
		}
		public Dimension sise(WebElement ele)
		{
			Dimension size = ele.getSize();
			return size;
		}
		public Rectangle rectangle(WebElement ele)
		{
			Rectangle rect = ele.getRect();
			return rect;
		}
		
}
