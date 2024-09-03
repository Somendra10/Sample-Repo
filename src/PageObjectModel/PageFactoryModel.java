package PageObjectModel;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryModel {
	
	    WebDriver driver;
	    
	    public PageFactoryModel(WebDriver driver) {
	    	
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	
	    	
	    }
	   
	     
	    @FindBy(id="login-button")
	    private WebElement signIn;
	 //  public static List<WebElement> signIns;
	  
	    

       @FindBy(xpath="//button[normalize-space()='Create Account']") 
       private WebElement createAccount;
       
       

       @FindBy(xpath="//a[@class='menu-icon store-locator desktop']") 
       private WebElement findAStore;
       
	    
       @FindBy(id="user-name") 
       private WebElement username;
	


	    
	    
	    
	    
	    
	    public void signInClick() {
	    	
	    	signIn.click();
	    	
	    	/*findAStore.click();
	  boolean findAStoretitle= driver.getTitle().equals("Our Stores");
	  Assert.assertTrue("Navigation Title not match", findAStoretitle); */
	    	
	    	
	    }
	    
	    public void emailClick(String Email) {
	    	
	    	username.sendKeys(Email);
	    }
	    
	
	

}
