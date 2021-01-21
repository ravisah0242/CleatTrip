package com.cleartrip1.generics;

import org.openqa.selenium.WebElement;

public class BasePageIsSelect 
{
	public void isSelected(WebElement ele)
	{
		boolean dis = ele.isDisplayed();
		System.out.println("Radio Button is Selected ---> "+dis);
	}
	
	public void enable(WebElement ele)
	{
		boolean enable = ele.isEnabled();
		System.out.println(enable);				
	}

	public void select(WebElement ele)
	{
		boolean sel = ele.isSelected();
	}
}
