package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class DummyPaymentPage extends BestBuyBaseTest{

		
		@FindBy(xpath="//button[text()='Checkout']")
		WebElement checkout;
		
		@FindBy(xpath="//span[text()='Return to Cart']")
		WebElement returnToCart;
		
		public void clickCheckout() {
			
			try {
				waitForElement(checkout);
				clickAction(checkout);
			}catch(Exception e) {
				System.out.println("Problem occured in clickCheckout ");
				e.printStackTrace();
			}
		}
		
		@FindBy(xpath="//button[text()='Continue as Guest']")
	    WebElement guest;
	    
	    public void signInAsGuest() {
	    	
            try {
				waitForElement(guest);
				clickAction(guest);
			}catch(Exception e) {
				System.out.println("Problem occured in signInAsGuest ");
				e.printStackTrace();
			}
			
	    }
	    
	    @FindBy(id="user.emailAddress")
	     WebElement emailadd;
	     
	     public void enterEmailid(String email) {
	    	 
	     try {
			  waitForElement(emailadd);
			  clearTxt(emailadd);
			  sendText(emailadd, email);
		  }catch(Exception e) {
			  System.out.println("Problem occured in enterEmailid");
			  e.printStackTrace();
		  }
	 }

	     
	     @FindBy(id="user.phone")
	     WebElement phoneadd;
	     
	     public void enterphoneno(String no) {
	    	 
	     try {
			  waitForElement(phoneadd);
			  clearTxt(phoneadd);
			  sendText(phoneadd, no);
		  }catch(Exception e) {
			  System.out.println("Problem occured in enterphoneno");
			  e.printStackTrace();
		  }
	 }
	
	   @FindBy(xpath="//span[text()='Continue to Payment Information']")
	   WebElement continuePayment;
	   
	   public void enterContinuePayment() {
		   
		   try {
			   waitForElement(continuePayment);
			   jsScrollUpToElement(continuePayment);
			   clickAction(continuePayment);
			   waitForElement(returnToCart);
			   jsScrollUpToElement(returnToCart);
			   
			   }catch(Exception e) {
				   System.out.println("Problem occured in enterContinuePayment");
				   e.printStackTrace();
			   }
	   }
	   
	   @FindBy(id="number")
	   WebElement ccnumber;
	   
	   public void entercreditcardno(String ccNo) {
		   
		   try {
			   waitForElement(ccnumber);
			   clearTxt(ccnumber);
			   sendText(ccnumber, ccNo);
			   }catch(Exception e) {
				   System.out.println("Problem occured in entercreditcardno");
				   e.printStackTrace();
			   }
	   }
	   
	   @FindBy(id="expMonth")
	   WebElement expMonth;
	   
	   public void selectExpiryMonth(String month) {
		   
		   try {
			   waitForElement(expMonth);
			   selectDDByValue(expMonth, month);
		   }catch(Exception e) {
			   System.out.println("Problem occured in selectExpiryMonth");
			   e.printStackTrace();
		   }
	   }
	   
	   @FindBy(id="expYear")
	   WebElement expYear;
	   
	   public void selectExpiryYear(String year) {
		   
		   try {
			   waitForElement(expYear);
			   selectDDByValue(expYear, year);
		   }catch(Exception e) {
			   System.out.println("Problem occured in selectExpiryYear");
			   e.printStackTrace();
		   }
	   }
	   
	   @FindBy(id="cvv")
	   WebElement cvv;
	   
	   public void enterCVV(String no) {
		   
		   try {
			   waitForElement(cvv);
			   clearTxt(cvv);
			   sendText(cvv, no);
		   }catch(Exception e) {
			   System.out.println("Problem occured in enterCVV");
			   e.printStackTrace();
		   }
	   }
	   
	   
	    @FindBy(id="firstName")
	    WebElement fname;
	    
	    public void enterfirstName(String fnametext) {
	    	
	    	try {
	    		waitForElement(fname);
	    		clearTxt(fname);                                                       
	    		sendText(fname,fnametext);
	    	}catch(Exception e) {
	    		System.out.println("Problem occured in enterfirstName");
	    		e.printStackTrace();
	    	}
	    }
	    
	    @FindBy(id="lastName")                                        
	    WebElement lname;
	    
	    public void enterlastName(String lnametext) {
	    	
	    	try {
	    		waitForElement(lname);
	    		clearTxt(lname);
	    		sendText(lname,lnametext);
	    	}catch(Exception e) {
	    		System.out.println("Problem occured in enterlastName");
	    		e.printStackTrace();
	    	}
	    }
	    
	    
	  @FindBy(id="street")
	  WebElement address;
	  
	  public void enterAddress(String addr) {
		  
		  try {
			  waitForElement(address);
			  clearTxt(address);
			  sendText(address, addr);
		  }catch(Exception e) {
			  System.out.println("Problem occured in enterAddress");
			  e.printStackTrace();
		  }
	  }
	  
	  
	  @FindBy(id="city")
	  WebElement city;
	  
     public void enterCity(String cityName) {
		  
		  try {
			  waitForElement(city);
			  clearTxt(city);
			  sendText(city, cityName);
		  }catch(Exception e) {
			  System.out.println("Problem occured in enterCity");
			  e.printStackTrace();
		  }
	  }
     
     @FindBy(id="state")
     WebElement state;
     
     public void selectState(String stateName) {
   	  
   	  try {
   		  waitForElement(state);
   		  selectDDByValue(state, stateName);
			 
		  }catch(Exception e) {
			  System.out.println("Problem occured in selectState");
			  e.printStackTrace();
		  }
     }
	    
     @FindBy(id="zipcode")
     WebElement zipcode;
     
    public void enterZipcode(String zipcodeUS) {
		  
		  try {
			  waitForElement(zipcode);
			  clearTxt(zipcode);
			  sendText(zipcode, zipcodeUS);
		  }catch(Exception e) {
			  System.out.println("Problem occured in enterZipcode");
			  e.printStackTrace();
		  }
	  }
    
    @FindBy(xpath = "xpath=\"//button[text()='Place your Order - Contact Card']")
    WebElement placeOrder;
    
    public void placeYourOrder() {
    	try {
    		waitForElement(placeOrder);
    		clickAction(placeOrder);
    	}catch(Exception e) {
			  System.out.println("Problem occured in placeYourOrder");
			  e.printStackTrace();
		  }
    }
   
}
