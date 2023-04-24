package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class AddToCart_ByDepartmentPage extends BestBuyBaseTest {
	
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menuButton;
	
	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliancesButton;
	
	@FindBy(xpath="//button[text()='Small Kitchen Appliances']")
	WebElement smallkitchenappliancesButton;
	
	@FindBy(xpath="//a[text()='Air Fryers & Deep Fryers']")
	WebElement fryersButton;
	
	@FindBy(xpath="//a[text()='Ninja - Foodi 6-in-1 8-qt. 2-Basket Air Fryer with DualZone Technology - Dark Grey']")
	WebElement item2;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocart2;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocart2again;

	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocartButton;
	

	
	public void menubutton() {
				
		try {
			waitForElement(menuButton);
			clickAction(menuButton);
		}catch(Exception e) {
			System.out.println("Problem occured in menubutton");
			e.printStackTrace();
			
		}
	}
	
	public void appliancesbutton() {
		
		try {
			waitForElement(appliancesButton);
			clickAction(appliancesButton);
		}catch(Exception e) {
			System.out.println("Problem occured in appliancesButton");
			e.printStackTrace();
	  }
	}
	
	public void smallkitchenappliancesbutton() {
		
		try {
			waitForElement(smallkitchenappliancesButton);
			clickAction(smallkitchenappliancesButton);
		}catch(Exception e) {
			System.out.println("Problem occured in smallkitchenappliancesbutton");
			e.printStackTrace();
			
		}
	}
	
	public void fryersbutton() {
		
		try {
			waitForElement(fryersButton);
			clickAction(fryersButton);
		}catch(Exception e) {
			System.out.println("Problem occured in fryersbutton");
			e.printStackTrace();
			
		}
	}
	
	public void item2toadd() {
		
		try {
			waitForElement(item2);
			clickAction(item2);
		}catch(Exception e) {
			System.out.println("Problem occured in item2toadd");
			e.printStackTrace();
			
		}
	}
	
	public void addtoCart_ByDept() {
		
		try {
			waitForElement(addtocart2);
			clickAction(addtocart2);
		}catch(Exception e) {
			System.out.println("Problem occured in addtoCart_ByDept");
			e.printStackTrace();
			
		}
	}
	
   	
	 public void gotocart2() {
			
			try {
				waitForElement(gotocartButton);
				clickAction(gotocartButton);
			}catch(Exception e) {
				System.out.println("Problem occured in gotocart");
				e.printStackTrace();
				
			}
		}

}
