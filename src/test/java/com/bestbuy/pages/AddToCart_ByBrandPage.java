package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class AddToCart_ByBrandPage extends BestBuyBaseTest{

	
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menuButton;
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brandsButton;
	
	@FindBy(xpath="//a[text()='Intel']")
	WebElement intelButton;
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement laptopButton;
	
	@FindBy(xpath="//a[text()='HP - 17.3\" HD+ Laptop - Intel Core i3 - 8GB Memory - 256GB SSD - Natural Silver']")
	WebElement item3;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocart3;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocart3again;

	
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
	
   public void brandbutton() {
		
		try {
			waitForElement(brandsButton);
			clickAction(brandsButton);
		}catch(Exception e) {
			System.out.println("Problem occured in brandsbutton");
			e.printStackTrace();
	   }
	}
	

  public void intelbutton() {
	
	try {
		waitForElement(intelButton);
		clickAction(intelButton);
	}catch(Exception e) {
		System.out.println("Problem occured in intelbutton");
		e.printStackTrace();
			}
}


  public void laptopbutton() {
	
	try {
		waitForElement(laptopButton);
		clickAction(laptopButton);
	}catch(Exception e) {
		System.out.println("Problem occured in laptopbutton");
		e.printStackTrace();
		
	}
}


   public void item3toadd() {
	
	try {
		waitForElement(item3);
		clickAction(item3);
	}catch(Exception e) {
		System.out.println("Problem occured in item3toadd");
		e.printStackTrace();
		
	}
}


  public void addtoCart_ByBrand() {
	
	try {
		waitForElement(addtocart3);
		clickAction(addtocart3);
	}catch(Exception e) {
		System.out.println("Problem occured in addtoCart_ByBrand");
		e.printStackTrace();
		
	}
}
  
  public void addtoCart_ByBrandAgain() {
		
		try {
			waitForElement(addtocart3again);
			clickAction(addtocart3again);
		}catch(Exception e) {
			System.out.println("Problem occured in addtoCart_ByBrandAgain");
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
