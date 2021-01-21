package com.cleartrip1.generics;

import org.openqa.selenium.WebElement;

public class BasePageAutosuggesion 
{
	public String autoSuggesion(WebElement ele)
	{
		String suggesion = ele.getText();
		System.out.println(suggesion);
		return suggesion;
	}

}
