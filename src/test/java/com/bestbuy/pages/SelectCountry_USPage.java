package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class SelectCountry_USPage extends BestBuyBaseTest {
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")
	WebElement ChooseCountry;
	
	public void selectCountryUS() {
		try {
		waitForElement(ChooseCountry);	
		clickAction(ChooseCountry);
				
	}catch(Exception e) {
		System.out.println("Problem occured while choosing country US ");
		e.printStackTrace();
	}
}
	
	
}
