package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.ScrollUptoBottomLinkPage;
import com.bestbuy.pages.SelectCountry_USPage;

public class ScrollUptoBootomLinkTest extends ScrollUptoBottomLinkPage {
	
	@Test(priority=6)
	public void scrollToFindElement() {
		
		try {
			
            openBrowser("https://www.bestbuy.com/");
			
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();
			Thread.sleep(5000);
			ScrollUptoBottomLinkPage scrollElements = PageFactory.initElements(driver, ScrollUptoBottomLinkPage.class);
			scrollElements.scrollDown();
			Thread.sleep(5000);
			scrollElements.scrollUp();
			scrollElements.printTheBottomLinks();
			scrollElements.quitBrowser();
			
		}catch(Exception e) {
			System.out.println("Problem in testing while scrolling");
			e.printStackTrace();
		}
		
	}
	
	
}
