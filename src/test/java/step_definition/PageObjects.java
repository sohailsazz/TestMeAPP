package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
WebDriver driver;
public PageObjects(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="SignIn")
public static WebElement signin;

@FindBy(name="userName")
public static WebElement username;

@FindBy(name="password")
public static WebElement password;

@FindBy(name="Login")
public static WebElement login;

@FindBy(xpath="//span[contains(text(),'All')]")
public static WebElement allcategory;

@FindBy(xpath="//span[contains(text(),'Electronics')]")
public static WebElement Electronics;

@FindBy(xpath="//span[contains(text(),'Head Phone')]")
public static WebElement Headphones;

@FindBy(xpath="//a[@class='btn btn-success btn-product']")
public static WebElement addtocart;

@FindBy(xpath="//a[contains(text(),'Cart')]")
public static WebElement Cart;

@FindBy(xpath="//a[@class='btn btn-success btn-block']")
public static WebElement checkout;

@FindBy(xpath="//input[@id='quantity_1']")
public static WebElement quantity;

@FindBy(xpath="//input[@id='choice-dollar']")
public static WebElement checkbox;

@FindBy(xpath="//textarea[@id='add2']")
public static WebElement addresstextbox ;

@FindBy(xpath="//form[2]//input[1]")
public static WebElement proceedtoPay ;

@FindBy(xpath="//label[contains(text(),'Andhra Bank')]//i")
public static WebElement selectBank ;

@FindBy(xpath="//a[@id='btn']")
public static WebElement Continue ;


}
