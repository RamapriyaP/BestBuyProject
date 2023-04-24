package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class CreateAccountPage extends BestBuyBaseTest{
	

	@FindBy(xpath="//span[text()='Account']")      
	WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")     
	WebElement createAcc;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(id="reenterPassword")
	WebElement confirmPassword;
	
	@FindBy(id="phone")
	WebElement phoneNo;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createAnAccount;
	
       public void  clickaccountTab() {
		
		try {
			waitForElement(account);
			clickAction(account);
		}catch(Exception e) {
			System.out.println("Problem occured in clickaccountTab");
			e.printStackTrace();
			
		}
				
	}
	
	public void createAccountTab() {
		
		try {
			waitForElement(createAcc);
			clickAction(createAcc);
		}catch(Exception e) {
			System.out.println("Problem occured in createAccountTab");
			e.printStackTrace();
		}
	}
	
	public void enterFirstname(String fname) {
		
		try {
			waitForElement(firstName);
			clearTxt(firstName);
			sendText(firstName, fname);
		}catch(Exception e) {
			System.out.println("Problem occured in enterFirstname");
			e.printStackTrace();
			
		}
	}
	
    public void enterlastname(String lname) {
		
		try {
			waitForElement(lastName);
			clearTxt(lastName);
			sendText(lastName, lname);;
		}catch(Exception e) {
			System.out.println("Problem occured in enterlastname");
			e.printStackTrace();
			
		}
	}
    
    public void enterEmail(String emailaddr) {
		
		try {
			waitForElement(email);
			clearTxt(email);
			sendText(email, emailaddr);
		}catch(Exception e) {
			System.out.println("Problem occured in enterEmail");
			e.printStackTrace();
			
		}
	}


    public void enterpassword(String pass) {
	
	try {
		waitForElement(password);
		clearTxt(password);
		sendText(password, pass);
	}catch(Exception e) {
		 System.out.println("Problem occured in enterpassword");
		e.printStackTrace();
       
	}
}

    public void enterconfirmpassword(String cpaassword) {
	
	try {
		waitForElement(confirmPassword);
		clearTxt(confirmPassword);
		sendText(confirmPassword, cpaassword);
	}catch(Exception e) {
		System.out.println("Problem occured in enterconfirmpassword");
		e.printStackTrace();
		
	}
}


    public void enterphoneno(String phNo) {
	
	try {
		waitForElement(phoneNo);
		clearTxt(phoneNo);
		sendText(phoneNo, phNo);
	}catch(Exception e) {
		System.out.println("Problem occured in enterphoneno");
		e.printStackTrace();
		
	}
}

    public void clickCreateAnAccount() {
    	
    	try {
    		waitForElement(createAnAccount);
    		clickAction(createAnAccount);
    	}catch(Exception e) {
    		System.out.println("Problem occured in clickCreateAnAccount");
    		e.printStackTrace();
    		
    	}
    }

}
