package com.cleartrip1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cleartrip1.generics.AutoConstant;
import com.cleartrip1.generics.BasePageErrorMassage;

public class ReviewYourItinerary implements AutoConstant
{
	@FindBy(xpath="//h2[.='Review your itinerary']")
	private WebElement ReviewYourItinerarytext;
	
	
	
	
	public ReviewYourItinerary(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ReviewyouritinerarMethod()
	{
		BasePageErrorMassage bpe=new BasePageErrorMassage();
		bpe.veryErrorMassage(ReviewYourItinerarytext);
	}
}
