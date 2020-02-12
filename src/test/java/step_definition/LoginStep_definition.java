package step_definition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import junit.framework.Assert;

public class LoginStep_definition extends Common_Base {

	PageObjects p;
	
	@Given("Navigate to Home page")
	public void navigate_to_Home_page() {
	
		Common_Base.LaunchBrowser();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		Common_Base.login();
		
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("User Logged in successfully");
		Common_Base.LaunchBrowser();
		Common_Base.login();
	   
	}
	
	//////////////////////////This is Second Scenario after Login//////////////////////////////////////
	
	
	@Given("Larry has already Signed-In in the TestMeApp")
	public void larry_has_already_Signed_In_in_the_TestMeApp() {
		Common_Base.LaunchBrowser();
		Common_Base.login();
		System.out.println("Successful");
	}

	@When("Larry increase the headphone by {int}")
	public void larry_increase_the_headphone_by(Integer int1) {
		Common_Base.productselect();
		String newvalue = Integer.toString(int1);
		p.quantity.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		p.quantity.sendKeys(newvalue);
	
	}

	@When("continue for checkout")
	public void continue_for_checkout() {
		p.checkout.click();
	}

	@When("change the shipping address to a new address as {string}")
	public void change_the_shipping_address_to_a_new_address_as(String string) throws InterruptedException {
	   p.checkbox.click();
	   p.addresstextbox.sendKeys("Pune");
	   p.proceedtoPay.click();
	   Thread.sleep(2000);
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.elementToBeClickable(p.selectBank));
	   p.selectBank.click();
	   Thread.sleep(3000);
	   p.Continue.click();
	   Common_Base.paymentOptions();
		
	}

	@Then("the product should be delivered to the new address")
	public void the_product_should_be_delivered_to_the_new_address() {
		String newaddressText = p.addresstextbox.getText();
		Assert.assertTrue(newaddressText.contains("Pune"));
		
	    
	}

	

	

}
