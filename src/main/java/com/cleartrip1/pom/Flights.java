package com.cleartrip1.pom;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cleartrip1.generics.AutoConstant;
import com.cleartrip1.generics.BasePageIsSelect;
import com.cleartrip1.generics.BaseTest;
import com.cleartrip1.generics.ExcelLibrary;

public class Flights extends BaseTest implements AutoConstant
{
	
	//public WebDriver driver;
	
	@FindBy(xpath="(//a[.='Flights'])[2]")
	private WebElement flightslink;
	
	@FindBy(xpath="(//input[@name='trip_type'])[2]")
	private WebElement RoundtripRadiobutton;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	//@FindBy(xpath="//input[@name='origin']")
	private WebElement serchdeparturaltextfaild;  	//using for AutoSuggesion;
	
	//@FindBy(xpath="//li[@class='list']")
	//private List<WebElement> suggegasions;*/
	
	/*@FindBy(xpath="//a[.='Bangalore, IN - Kempegowda International Airport (BLR)']")
	private WebElement BangaloreAirportlink;*/
	
	@FindBy(id="ToTag")
	private WebElement serchtocitylink;
	
	//@FindBy(xpath="//a[.='New Delhi, IN - Indira Gandhi Airport (DEL)']")
	//private WebElement DelhiAirportlink;
	
	//@FindBy(xpath="(//a[.='13'])[1]")
	@FindBy(xpath="(//a[@class='ui-state-default '])[6]")
	private WebElement jurnydatelink;

	@FindBy(xpath="(//a[.='14'])[1]")
	private WebElement Returndatelink;
	
	@FindBy(id="SearchBtn")
	private WebElement Serchbuttonlink;
	
	
	public Flights(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void flightTripMethod() throws IOException, InterruptedException
	{
		BasePageIsSelect bpi=new BasePageIsSelect();
		flightslink.click();
		RoundtripRadiobutton.click();
		bpi.isSelected(RoundtripRadiobutton);
		serchdeparturaltextfaild.sendKeys(ExcelLibrary.GetcellValue(excel_path, excel_sheet, 8, 2));
		/*Thread.sleep(3000);
		System.out.println(suggegasions.size());
		for(int i=0; i<suggegasions.size(); i++)
		{
			if(suggegasions.get(i).getText().equalsIgnoreCase("Bangalore, IN - Kempegowda"))
			{
				suggegasions.get(i).click();
			}
		}*/
		serchtocitylink.sendKeys(ExcelLibrary.GetcellValue(excel_path, excel_sheet, 8, 3));
		//BangaloreAirportlink.click();
		//DelhiAirportlink.click();
		jurnydatelink.click();
		Returndatelink.click();
		Serchbuttonlink.click();
	}
	
	
	
	
	
	
	
	
	
	
	/*public void isSelectedMethod()
	{
		Ckeckboxroundtripbuttonlink.click();
		System.out.println(Ckeckboxroundtripbuttonlink.isSelected());
		//driver.findElement(By.xpath("Ckeckboxroundtripbuttonlink"));
	}
	if(Ckeckboxroundtripbuttonlink=="true")
	{
		System.out.println("Check box is Selected");
	}
	else
	{
		System.out.println("Check box is not Selected");
	}*/

}
