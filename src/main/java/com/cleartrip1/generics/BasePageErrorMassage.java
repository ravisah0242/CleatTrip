package com.cleartrip1.generics;

import org.openqa.selenium.WebElement;

public class BasePageErrorMassage 
{
	public String veryErrorMassage(WebElement ele)
	{
		String text=ele.getText();
		System.out.println(text);
		return text;
	}
	
	
}
