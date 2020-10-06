package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[.='Users']")
	private WebElement userstab;
	
	@FindBy(xpath="//div[.='New User']")
	private WebElement newUser;
	
	@FindBy(id="createUserPanel_firstNameField")
	private WebElement firstnameTb;
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement lastnameTb;
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement emailAddressTb;
	
	@FindBy(xpath="//div[.='Save & Send Invitation']")
	private WebElement saveandsendinitation;
	
     @FindBy(xpath="(//div[.='-- department not assigned --'])[1]")
    private WebElement department;
     
     public HomePage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void addingUser(String firstname,String lastname,String email)
     {
    	 userstab.click();
    	 newUser.click();
    	 firstnameTb.sendKeys(firstname);
    	 lastnameTb.sendKeys(lastname);
    	 emailAddressTb.sendKeys(email);
     }
     
   public void saveinvitation()
   {
	   saveandsendinitation.click();
   }

public WebElement getDepartment() {
	return department;
}
	

}
