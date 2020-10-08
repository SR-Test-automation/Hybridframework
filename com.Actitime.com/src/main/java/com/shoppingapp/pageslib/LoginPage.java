package com.shoppingapp.pageslib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
@FindBy(xpath="//a[@class='login']")
private WebElement siginlink;

@FindBy(id="email")
private WebElement emailaddresstb;

@FindBy(id="passwd")
private WebElement passwordtb;

@FindBy(id="SubmitLogin")
private WebElement sumbitbtn;

public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
this.driver=driver;
}
public HomePage sigincreditials(String email,String password)
{
siginlink.click();
emailaddresstb.sendKeys(email);
passwordtb.sendKeys(password);
sumbitbtn.click();
return new HomePage(driver);
}

}


