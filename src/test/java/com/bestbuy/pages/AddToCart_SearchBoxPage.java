package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class AddToCart_SearchBoxPage extends BestBuyBaseTest  {

	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchbox;
	
	@FindBy(linkText="LEGO - Super Mario Character Packs – Series 6 71413")
	WebElement item1;
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement searchsubmitbutton;   
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocart1;
	
	@FindBy(xpath="//button[@class='c-button-link close-modal-x close-modal-button']")
	WebElement closeButton;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocartButton;
	
	
	public void searchBoxText(String searchtext) {
		
		try {
			waitForElement(searchbox);
			clearTxt(searchbox);
			sendText(searchbox, searchtext);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem while entering text in search box");
		}
		
	}
	
	
	  public void searchsubmitButton() {
		
		try {
			waitForElement(searchsubmitbutton);
			clickAction(searchsubmitbutton);
		}catch(Exception e) {
			System.out.println("Problem while searchsubmitbutton");
			e.printStackTrace();
			
		}
	}

	 
	
	public void item1toadd() {
		
		try {
			waitForElement(item1);
		//	jsScrollUpAndDown(600);
			clickAction(item1);
		}catch(Exception e) {
			System.out.println("Problem while item 1 to add");
			e.printStackTrace();
			
		}
	}
	
		
	public void addtocart_searchbox() {
		
		try {
			waitForElement(addtocart1);
		//	jsScrollUpAndDown(800);
		//	jsScrollUpToElement(addtocart1);
			clickAction(addtocart1);
      	}catch(Exception e) {
			System.out.println("Problem while clicking addtocart_searchbox ");
			e.printStackTrace();
			
		}
	}
	
	 public void gotocart() {
			
			try {
				waitForElement(gotocartButton);
				clickAction(gotocartButton);
			}catch(Exception e) {
				System.out.println("Problem occured in gotocart");
				e.printStackTrace();
				
			}
		}
	
	 
}
