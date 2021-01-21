package com.cleartrip1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip1.generics.AutoConstant;

public class BangaloreTrip implements AutoConstant
{
	
	@FindBy(xpath="(//div[@class='rt-tuple-container__details ms-grid-row-2'])[2]")
	private WebElement seondflightlink;
	
	@FindBy(xpath="(//div[@class='rt-tuple-container__details ms-grid-row-2'])[27]")
	private WebElement Returnthirdflightlink;
	
	@FindBy(xpath="//button[.='Book']")
	private WebElement bookonglink;
	
	
	
	
	public BangaloreTrip(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void selectFlightMethod()
	{
		seondflightlink.click();
		Returnthirdflightlink.click();
		bookonglink.click();
	}
	
}
