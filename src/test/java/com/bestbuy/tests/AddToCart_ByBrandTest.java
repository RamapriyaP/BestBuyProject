package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCart_ByBrandPage;
import com.bestbuy.pages.SelectCountry_USPage;
import com.bestbuy.utils.BestBuyBaseTest;

public class AddToCart_ByBrandTest extends AddToCart_ByBrandPage{
	
	@Test(priority=9)
	public void addItemByBrands() {
		
		try {
            openBrowser("https://www.bestbuy.com/");
			
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS(); 
			
			AddToCart_ByBrandPage brandElements = PageFactory.initElements(driver, AddToCart_ByBrandPage.class);
			brandElements.menubutton();
			brandElements.brandbutton();
			brandElements.intelbutton();
			brandElements.laptopbutton();
			brandElements.item3toadd();
			brandElements.addtoCart_ByBrand();
			brandElements.addtoCart_ByBrandAgain();
			brandElements.gotocart();
			brandElements.quitBrowser();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing addItemByBrand ");
		}
	}	

}
