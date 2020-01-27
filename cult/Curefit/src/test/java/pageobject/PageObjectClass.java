package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	public PageObjectClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@class='non-clp-header']")
	public WebElement obj_eatfit;
	
	@FindBy(xpath = "//div[@class='city-name']")
	public WebElement obj_location;
	
	@FindBy(xpath = "//input[@class='search-input']")
	public WebElement obj_loc;
	
	@FindBy(xpath = "//span[text()='Combos']")
	public WebElement obj_combos;
	
	@FindBy(xpath = "(//div[text()='ADD'])[67]")
	public WebElement obj_Wellness;
	
	@FindBy(xpath = "//img[@class='cart-image']")
	public WebElement obj_cart;
	
	@FindBy(xpath = "//div[@class = 'cart-wrapper']")
	public WebElement obj_cart_wrapper;
	
	
	@FindBy(xpath = "//div[@class = 'btn buy click']")
	public WebElement obj_Buy;
	
	@FindBy(className = "plus-sign")
	public WebElement obj_plus_sign;
	
	@FindBy(xpath = "(//div[@class='cart-checkout'])[1]")
	public WebElement obj_cart_checkout;
	
	@FindBy(xpath = "//button[@class='css-3uygy3 css-14t62iv']")
	public WebElement obj_sngoogle;
	
	@FindBy(xpath = "//button[text()='I agree']")
	public WebElement obj_agree;
	

	
	@FindBy(id ="identifierId")
	public WebElement obj_gmail;
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement obj_next;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement obj_pwd;

	@FindBy(xpath = "//div[text()='Add your address']")
	public WebElement obj_address;

	@FindBy(xpath = "//button[text()='Add New Address']")
	public WebElement obj_btnaddress;
	
	@FindBy(xpath = "//button[text()='Pick this location']")
	public WebElement obj_btnloc;
	
	@FindBy(xpath = "//input[@class='address-line-input']")
	public WebElement obj_flat;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement obj_checkmark;
	
	@FindBy(xpath = "//button[@class='save-address-button']")
	public WebElement obj_saveaddress;
	
	@FindBy(xpath = "//input[@class='location-search-input']")
	public WebElement obj_loc_add;

	@FindBy(xpath = "//button[@class='btn checkout-proceed-button']")
	public WebElement obj_checkout;
	
	@FindBy(xpath = "//div[text()='Net Banking']")
	public WebElement obj_NetBanking;

	@FindBy(xpath = "//select[@id='bank-select']")
	public WebElement obj_Axis;
	
	
}
