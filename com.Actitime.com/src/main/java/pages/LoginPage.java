package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement usernameTextbox;
	
	@FindBy(name="pwd")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logincreditails(String us,String pwd)
	{
		usernameTextbox.sendKeys(us);
		passwordTextbox.sendKeys(pwd);
		loginButton.click();
	}
	

}
