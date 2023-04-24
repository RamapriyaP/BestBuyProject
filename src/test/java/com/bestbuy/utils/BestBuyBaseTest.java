package com.bestbuy.utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuyBaseTest {
	
	public static WebDriver driver = null;
	
	
	public void openBrowser(String url) {
		
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while launching the browser");
		}
		
	}
	
	
	
	public void quitBrowser() 
	{
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem while quitting the browser");
		}
	}
	
	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem while closing the browser");
		}
	}
	
   public void clickAction(WebElement ele) {
		
		try {
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem while clicking the element in the browser");
		}
		
	}
   
   public void clearTxt(WebElement ele) {
	   
	   try {
		   ele.clear();
	   }catch(Exception e) {
		   System.out.println("Problem in clearing the text");
		   e.printStackTrace();
	   }
   }
   
   public void brokenLinkCheck(String url) {
	   
	   try {
		   HttpURLConnection httpConnection = (HttpURLConnection)(new URL(url).openConnection());
		   httpConnection.connect();
		   int responsecode = httpConnection.getResponseCode();
		   
		   if(responsecode>=400) {
			   System.out.println("The given URL "+url+" is broken");
		   }
		   else {
			   System.out.println("The given URL "+url+" is not broken");
 
		   }
			   
	   }catch(Exception e) {
		   e.printStackTrace();
		   System.out.println("Problem while checking if the link is broken");
	   }
   }
   
   public void sendText(WebElement ele, String text) {
	   
	   try {
		   
		   ele.clear();
		   ele.sendKeys(text);
	   }catch(Exception e) {
		   e.printStackTrace();
		   System.out.println("Problem while sending the text");
	   }
	   
   }
   
   public void verifyTitlesUsingAssertion(String expectedTitle) {
	   
	   try {
		      
		   	   Assert.assertEquals(driver.getTitle(), expectedTitle);
			   		  		   
	   }catch(Exception e) {
		   e.printStackTrace();
		   System.out.println("Problem occured ");
	   }
   }


   public void jsScrollUpAndDown(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + value + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jsScrollRightAndLeft(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + value + ",0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  
   public void waitForElement(WebElement ele) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
   
   public void selectDDByValue(WebElement ele,String value)
	{
		
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
   
   
  
   
   public void screenShot(String ssname) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("./ssphotos/" + ssname + ".png");

			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   
   public void dismissAlert(WebElement ele) 
   {
	 try {
		Alert alert = driver.switchTo().alert();
		 alert.dismiss();
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   

}
