package bpo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import bpo.base.BpoBase;

public class LoginPage extends BpoBase {
	
	@FindBy(id="txtLogin")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive center-block')]")
	WebElement logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTile()
	{
		return driver.getTitle();
	}
	
	public boolean validatelogo()
	{
		return logo.isDisplayed();
	}
	public HomePage login(String un,String pwd)
	{
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

}
