package com.bestbuy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class ScrollUptoBottomLinkPage extends  BestBuyBaseTest{
	
	@FindBy(xpath="//a[text()='Accessibility']")
	WebElement accessibility;
	
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath ="//div[@class='flex justify-content-start']//a")
	List<WebElement> bottomLinks;
	
	public void scrollDown() {
		
		try {
			waitForElement(accessibility);
			jsScrollUpToElement(accessibility);
		} catch (Exception e) {
			System.out.println("Problem in scrolling down");
			e.printStackTrace();
		}
		
	}
	
	public void scrollUp() {
		
		try {
			waitForElement(topdeals);
			jsScrollUpToElement(topdeals);
		} catch (Exception e) {
			System.out.println("Problem in scrolling up");
			e.printStackTrace();
		}
		
	}
	
	 public void printTheBottomLinks()
	   {
		   try {
			   	System.out.println("Total Links: "+bottomLinks.size());
				
				for (WebElement eachLink:bottomLinks)
				{
					System.out.println(eachLink.getAttribute("href"));
				}
		   }catch (Exception e) {
				
				e.printStackTrace();
			}

	   }	


}
