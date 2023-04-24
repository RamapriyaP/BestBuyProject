package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class AllMenuTitlesPage extends BestBuyBaseTest {

	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement title1;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement title2;
	
	@FindBy(xpath="//a[text()='Totaltech Membership']")
	WebElement title3;
	
	@FindBy(xpath="//a[text()='Credit Cards']")
	WebElement title4;
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement title5;
	
	@FindBy(xpath="//a[text()='Gift Ideas']")
	WebElement title6;
	
	@FindBy(xpath="//a[text()='Health & Wellness']")
	WebElement title7;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement title8;
	
	@FindBy(linkText="Best Buy Outlet")                                                         
	WebElement title8a;
	
	@FindBy(linkText="Best Buy Business")                                                                                      
	WebElement title8b;
	
	public void menuTitle1(String expectedtitle) {
		
		try {
			waitForElement(title1);
			clickAction(title1);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title1");
			
		}catch(Exception e) {
			System.out.println("Problem in title1");
			e.printStackTrace();
		
		}
	}
	
   public void menuTitle2(String expectedtitle) {
		
		try {
			waitForElement(title2);
			clickAction(title2);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title2");
		}catch(Exception e) {
			System.out.println("Problem in title2");
			e.printStackTrace();
			
		}
	}


   public void menuTitle3(String expectedtitle) {
		
		try {
			waitForElement(title3);
			clickAction(title3);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title3");
		}catch(Exception e) {
			System.out.println("Problem in title3");
			e.printStackTrace();
			
		}
	}

   public void menuTitle4(String expectedtitle) {
		
		try {
			waitForElement(title4);
			clickAction(title4);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title4");
		}catch(Exception e) {
			System.out.println("Problem in title4");
			e.printStackTrace();
			
		}
	}

   public void menuTitle5(String expectedtitle) {
		
		try {
			waitForElement(title5);
			clickAction(title5);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title5");
		}catch(Exception e) {
			System.out.println("Problem in title5");
			e.printStackTrace();
			
		}
	}

   public void menuTitle6(String expectedtitle) {
		
		try {
			waitForElement(title6);
			clickAction(title6);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title6");
		}catch(Exception e) {
			System.out.println("Problem in title6");
			e.printStackTrace();
		}
	}

   public void menuTitle7(String expectedtitle) {
		
		try {
			waitForElement(title7);
			clickAction(title7);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title7");
		}catch(Exception e) {
			System.out.println("Problem in title7");
			e.printStackTrace();
			
		}
	}
   
   public void menuTitle8a(String expectedtitle) {
		
		try {
			waitForElement(title8);
			clickAction(title8);
			waitForElement(title8a);
			clickAction(title8a);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title8a");
		}catch(Exception e) {
			System.out.println("Problem in title8a");
			e.printStackTrace();
			
		}
	}
   
   public void menuTitle8b(String expectedtitle) {
		
		try {
			waitForElement(title8);
			clickAction(title8);
			waitForElement(title8b);
			clickAction(title8b);
			verifyTitlesUsingAssertion(expectedtitle);
			System.out.println("Validation done for title8b");
		}catch(Exception e) {
			System.out.println("Problem in title8b");
			e.printStackTrace();
			
		}
	}

}
