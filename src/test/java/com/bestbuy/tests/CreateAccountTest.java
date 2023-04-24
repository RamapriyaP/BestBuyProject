package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.CreateAccountPage;
import com.bestbuy.pages.SelectCountry_USPage;
import com.bestbuy.utils.BestBuyBaseTest;

public class CreateAccountTest extends CreateAccountPage {
	
	@Test(priority=2)
	public void createAccountForBestBuy() {
		
		try {
			
			openBrowser("https://www.bestbuy.com/");
			
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();
			
			CreateAccountPage createAcc_elements = PageFactory.initElements(driver, CreateAccountPage.class);
			
			
			createAcc_elements.clickaccountTab();
			createAcc_elements.createAccountTab();
			createAcc_elements.enterFirstname("Priya");
			createAcc_elements.enterlastname("P");
			createAcc_elements.enterEmail("testing.learning@yahoo.com");
			createAcc_elements.enterpassword("Testing@123");
			createAcc_elements.enterconfirmpassword("Testing@123");
			createAcc_elements.enterphoneno("9876543210");
			createAcc_elements.clickCreateAnAccount();
			createAcc_elements.quitBrowser();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem occured while testing create an account");
		}
	}
	

}
