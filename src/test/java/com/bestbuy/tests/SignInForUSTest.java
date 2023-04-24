package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SelectCountry_USPage;
import com.bestbuy.pages.SignInForUSPage;
import com.bestbuy.utils.BestBuyBaseTest;

public class SignInForUSTest extends BestBuyBaseTest{
	
	@Test(priority=3)
	public void signInforCountryUS() {
		
		try {
			openBrowser("https://www.bestbuy.com/");
			
			SignInForUSPage signin_elements = PageFactory.initElements(driver, SignInForUSPage.class);
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();
			signin_elements.clickaccountTab();
			signin_elements.clickSignin();
			signin_elements.emailSigningIn("testing.learning@yahoo.com");
			signin_elements.passwordSigningIn("Testing@123");
			signin_elements.clickSigninButton();
			signin_elements.screenShot("signIn");
			signin_elements.quitBrowser();          
		   
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem occured while testing signin for US");
		}
		
	}


}
