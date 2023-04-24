package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SelectCountry_USPage;

public class SelectCountry_USTest extends SelectCountry_USPage {
	
	@Test(priority=1)
	public void selectUS() {
		
		try {
			openBrowser("https://www.bestbuy.com/");
			SelectCountry_USPage us = PageFactory.initElements(driver, SelectCountry_USPage.class);
			us.selectCountryUS();
			us.quitBrowser();
			System.out.println("Website launched successfully for US country");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing for choosing US ");
		}
		
	}

}
