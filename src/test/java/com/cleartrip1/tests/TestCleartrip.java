package com.cleartrip1.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.cleartrip1.generics.BaseTest;
import com.cleartrip1.pom.BangaloreTrip;
import com.cleartrip1.pom.Flights;
import com.cleartrip1.pom.ReviewYourItinerary;

public class TestCleartrip extends BaseTest
{
	////public WebDriver driver;
	@Test
	public void triptest() throws IOException, InterruptedException
	{
		Flights c=new Flights(driver);
		c.flightTripMethod();
		
		BangaloreTrip bt=new BangaloreTrip(driver);
		bt.selectFlightMethod();
		
		ReviewYourItinerary ryi=new ReviewYourItinerary(driver);
		ryi.ReviewyouritinerarMethod();
		
	}

}
