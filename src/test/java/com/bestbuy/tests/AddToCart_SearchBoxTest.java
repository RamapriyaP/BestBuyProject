package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCart_SearchBoxPage;
import com.bestbuy.pages.SelectCountry_USPage;
import com.bestbuy.utils.BestBuyBaseTest;


public class AddToCart_SearchBoxTest extends AddToCart_SearchBoxPage {
	
	@Test(priority=7)
	public void addItemBySearchBox() {
		
		try {
			openBrowser("https://www.bestbuy.com/");
			
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();
			
			AddToCart_SearchBoxPage searchboxElements = PageFactory.initElements(driver, AddToCart_SearchBoxPage.class);
			searchboxElements.searchBoxText("toys");
			searchboxElements.searchsubmitButton();
			searchboxElements.item1toadd();
			searchboxElements.addtocart_searchbox();
			searchboxElements.gotocart();
			searchboxElements.quitBrowser();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing addItemBySearchBox ");
		}
		
	}

}
