package com.bestbuy.tests;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyBaseTest;

public class BrokenLinkTest extends BestBuyBaseTest {

	@Test(priority=5)
	public void brokenLink() {
		
		try {
			openBrowser("https://www.bestbuy.com/");
			BestBuyBaseTest checkIfBroken = new BestBuyBaseTest();
			checkIfBroken.brokenLinkCheck("https://www.bestbuy.com/");
			checkIfBroken.quitBrowser();
			
		}catch(Exception e) {
			System.out.println("Problem while checking if link is broken");
		}
	}
}
