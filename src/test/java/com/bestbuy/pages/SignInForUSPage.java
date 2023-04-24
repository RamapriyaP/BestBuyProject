package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BestBuyBaseTest;

public class SignInForUSPage extends BestBuyBaseTest {
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath ="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement email_signin;
	
	@FindBy(xpath ="//input[@id='fld-p1']")
	WebElement password_signin;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin_Button;
	
	public void  clickaccountTab() {
		
		try {
			waitForElement(account);
			clickAction(account);
		}catch(Exception e) {
			System.out.println("Problem occured in clickaccountTab ");
			e.printStackTrace();
			
		}
				
	}
	
	public void clickSignin() {
		
		try {
			waitForElement(signin);
		    clickAction(signin);
		}catch(Exception e) {
			System.out.println("Problem occured in clickSignin");
			e.printStackTrace();
		}
	}
	
	public void emailSigningIn(String email) {
		
		try {
			waitForElement(email_signin);
		    clickAction(email_signin);
		    sendText(email_signin, email);
		  }catch(Exception e) {
			  System.out.println("Problem occured in emailSigningIn");
			e.printStackTrace();
			
		}
	}
	
	public void passwordSigningIn(String pswd) {
		
		try {
			waitForElement(password_signin);
		    clearTxt(password_signin);
			sendText(password_signin,pswd);
		}catch(Exception e) {
			System.out.println("Problem occured in passwordSigningIn");
			e.printStackTrace();
			
		}
	}
	
	public void clickSigninButton() {
		
		try {
			waitForElement(signin_Button);
			clickAction(signin_Button);
		}catch(Exception e) {
			System.out.println("Problem occured in clickSigninButton");
			e.printStackTrace();		}
	}

}
