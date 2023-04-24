package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.DummyPaymentPage;
import com.bestbuy.pages.SelectCountry_USPage;

public class DummyPaymentTest extends DummyPaymentPage {

	@Test(priority=10)
	public void paymentProcess() {

		try {
			openBrowser("https://www.bestbuy.com/");

			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();	

			AddToCart_ByDepartmentTest dept = PageFactory.initElements(driver, AddToCart_ByDepartmentTest.class);
			dept.menubutton();
			dept.appliancesbutton();
			dept.smallkitchenappliancesbutton();
			dept.fryersbutton();
			dept.item2toadd();
			dept.addtoCart_ByDept();
			dept.gotocart2();
			
			
			DummyPaymentPage pay = PageFactory.initElements(driver, DummyPaymentPage.class);
			pay.clickCheckout();
			pay.signInAsGuest();
			pay.enterEmailid("testing.learning@yahoo.com");
			pay.enterphoneno("4372363966");
			pay.enterContinuePayment();
			pay.screenShot("payment");
			pay.entercreditcardno("3698787432837264");
			pay.selectExpiryMonth("01");
			pay.selectExpiryYear("2025");
			pay.enterCVV("638");
			pay.enterfirstName("Priya");
			pay.enterlastName("Prasath");
			pay.enterAddress("2545 Erin Centre Blvd");
			pay.enterCity("SanJose");
			pay.selectState("AL");
			pay.enterZipcode("98546");
			pay.placeYourOrder();
			

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing addItemByDepartment ");
		}
	}
}


