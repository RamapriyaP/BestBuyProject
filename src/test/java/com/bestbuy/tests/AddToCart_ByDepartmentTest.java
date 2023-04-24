package com.bestbuy.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCart_ByDepartmentPage;
import com.bestbuy.pages.SelectCountry_USPage;
import com.bestbuy.utils.BestBuyBaseTest;

public class AddToCart_ByDepartmentTest extends AddToCart_ByDepartmentPage{
	
	@Test(priority=8)
	public void addItemByDept() {
		
		try {
            openBrowser("https://www.bestbuy.com/");
			
			SelectCountry_USPage signin_element = PageFactory.initElements(driver,SelectCountry_USPage.class );
			signin_element.selectCountryUS();
			
			AddToCart_ByDepartmentPage departmentElements = PageFactory.initElements(driver, AddToCart_ByDepartmentPage.class);
			departmentElements.menubutton();
			departmentElements.appliancesbutton();
			departmentElements.smallkitchenappliancesbutton();
			departmentElements.fryersbutton();
			departmentElements.item2toadd();
			departmentElements.addtoCart_ByDept();
			departmentElements.gotocart2();
			}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while testing addItemByDepartment ");
		}
	}

}
