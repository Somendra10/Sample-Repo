package Pkg;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;

import PageObjectModel.ClasswithPOM;
import PageObjectModel.PageFactoryModel;


import org.junit.Assert;

public class Class1 {

	WebDriver driver;
	PageFactoryModel signIn;
	


	@BeforeTest

	public void BrowserInvoke() {

		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe\\");
		driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
	//	driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
        
	}

	/* @Test

	public void TestCase1() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		WebElement iframe= driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("datepicker")).click();		
		driver.findElement(By.className("ui-datepicker-month")).sendKeys("Dec");
		WebElement selectYr= driver.findElement(By.className("ui-datepicker-year"));
		Select select=new Select(selectYr);
		select.selectByValue("2034");
		driver.findElement(By.linkText("10")).click(); 
		
		
		
		signIn=new PageFactoryModel(driver);
		signIn.signInClick();
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        String d= driver.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println(d); 
		
		
		}  */
	
	
	@Test
	
	public void emailClick() throws InterruptedException {
		
		//signIn.emailClick("test@tets.com");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//Thread.sleep(5000);
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.className("submit-btn")));
		//boolean signUpBtnState= driver.findElement(By.className("submit-btn")).isEnabled();
		//Assert.assertFalse("Button is in enabeled state", signUpBtnState);
	
		
		
	
	
	/*@Test

	public void TestCase2() throws IOException, InterruptedException {

		
		//driver.navigate().back();
		driver.findElements(By.className("promo-link")).get(1).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		
      
	}  */
	
		
		
		//driver.findElements(By.className("promo-link")).get(2).click();

		// Explicit Wait

		// WebDriverWait Obj = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign
		// in']")));

		// Screenshot Script

		
		// File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Files.copy(f, new File(".\\Screenshots\\test.png"));
		 
   
		// Alert, Confirm & Prompt script

		/*
		 * driver.switchTo().frame("iframeResult");
		 * driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		 * Thread.sleep(5000); Alert alert = driver.switchTo().alert();
		 * alert.sendKeys("Test message"); 
		 * alert.accept();
		 */

		// Scroll up-to certain Element

		/*
		 * WebElement element=driver.findElement(By.id(
		 * "s-0e90a06e-4958-4b89-8a50-c645514a48a9-root")); 
		 * JavascriptExecutor js=(JavascriptExecutor) driver; 
		 * Thread.sleep(5000);
		 * js.executeScript("arguments[0].scrollIntoView();" , element);
		 */
	
	   // Scroll down to Page End
	   //  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     
	   //Scroll by pixel
	    // js.executeScript("window.scrollBy(0,300)");
	

		// Assertion (Button

	/*	WebElement expected = driver.findElements(By.className("button--primary")).get(0);
		Boolean actual = expected.isDisplayed();

		String Exp = "Customers with an account from the old website please use the \"Forgot your password\" link to reset your password.";
		String Actual = driver.findElement(By.className("login-info")).getText();
		Assert.assertEquals(Exp, Actual);  */
	
		
		// Dynamic Email
		
	/*	Random randomGenerator= new Random();
		int randomInt= randomGenerator.nextInt(1000);
		driver.findElement(By.id("login_email")).sendKeys("SS+"+randomInt+"@test.com"); */
	
	  // Hover a mouse 
	 
	/*WebElement element=driver.findElement(By.xpath("//a[@id='Profile']"));
    Thread.sleep(3000);
	Actions action=new Actions (driver);
	action.moveToElement(element).perform();  */
	
	
// How to select item from drop down but the pre-req is it should have tag name 'Select'
	 
	/*Select objSelect = new Select(driver.findElement(By.id("Seacrch-box")));
	Select.selectByIndex(4);  */
	
	//how to switch tab
	
	/*  driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.lambdatest.com/"); */
		
		
		//How to Handel Dynamic Tabs 
		
		 // Open the initial page
        driver.get("https://example.com");

        // Click on a link that opens a new tab
        driver.findElement(By.linkText("Open new tab")).click();

        // Wait for the new tab to open
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        // Switch to the new tab
        driver.switchTo().window(tabs.get(1));
      

        // Perform actions on the new tab
        // ...

        // Close the new tab
        driver.close();

        // Switch back to the original tab
        driver.switchTo().window(tabs.get(0));
	
	
	// How to take screenshot of failed scenario
	
  /*   public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
	           byte[] ts= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	           scenario.attach(ts, "image/png", "Failed Case Screenshot");
	           
		}

		
		if(driver!=null) {
			
			driver.quit();
		}
		
	}   */
		
		
	}
	
}
		
		

	
	
	
	


