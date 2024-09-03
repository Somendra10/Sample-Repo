package PageObjectModel;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClasswithPOM {
	
	 WebDriver driver;
	 
	 public ClasswithPOM(WebDriver d){
		 
		 driver=d;
		 
		 
	 }
	 
	 By signInLink = By.className("promo-link");
	 
	 By signInBtn = By.className("button--primary");
	 
	 By emailField= By.id("login_email");
	 
	 public void clickOnSignIn() {
		 
		 driver.findElements(signInLink).get(2).click();
		 
	 }
	 
	 
	 public void verifySignInButton() {
		 
		 driver.findElements(signInBtn).get(0).click();
		 
		 
	 }
	 

	 
 public void enterRandomEmail() {
	 
	 Random randomGenerator= new Random();
	 int randomInt= randomGenerator.nextInt(1000);
	 driver.findElement(emailField).sendKeys("ss+"+randomInt+"@gmail.com");
		 
	 }
	 



}
