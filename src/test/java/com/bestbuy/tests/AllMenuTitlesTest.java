package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AllMenuTitlesPage;
import com.bestbuy.pages.SelectCountry_USPage;

public class AllMenuTitlesTest extends AllMenuTitlesPage {
	
	@Test(priority=4)
	public void menuTitlesTest() {
	
	try {
		
		openBrowser("https://www.bestbuy.com/");
		
		SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
		signin_element.selectCountryUS();
		
		AllMenuTitlesPage menuTitleElements = PageFactory.initElements(driver, AllMenuTitlesPage.class);
		menuTitleElements.menuTitle1("Top Deals and Featured Offers on Electronics - Best Buy");
		menuTitleElements.menuTitle2("Deal of the Day: Electronics Deals - Best Buy");
		menuTitleElements.menuTitle3("Best Buy Totaltech™ – Best Buy");
		menuTitleElements.menuTitle4("Best Buy Credit Card: Rewards & Financing");
		menuTitleElements.menuTitle5("Gifts Cards and E-Gift Cards - Best Buy");
		menuTitleElements.menuTitle6("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		menuTitleElements.menuTitle7("Health & Wellness Solutions & Technology - Best Buy");
		menuTitleElements.menuTitle8a("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
		menuTitleElements.menuTitle8b("Best Buy for Business - Best Buy");
		menuTitleElements.quitBrowser();
		
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Problem in testing All Menu Titles");
	}

}
}
