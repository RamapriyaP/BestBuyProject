package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SelectCountry_CanadaPage;

public class SelectCountry_CanadaTest extends SelectCountry_CanadaPage {
	
	@Test(priority=0)
	public void selectCanada()	{
		
		try {
			openBrowser("https://www.bestbuy.com/");
			SelectCountry_CanadaPage canada = PageFactory.initElements(driver, SelectCountry_CanadaPage.class);
			canada.selectCountryCanada();
			canada.quitBrowser();
			System.out.println("BestBuy website launched for Canada country");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing for choosing canada");
			
		}
		
	}

}
