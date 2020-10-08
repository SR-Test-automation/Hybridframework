package com.shoppingapp.pageslib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
public WebDriver driver;
@FindBy(xpath="//a[@title='Printed Summer Dress']")
private WebElement dress;

@FindBy(xpath="//select[@name='group_1']")
private WebElement pricedd;



@FindBy(id="layered_id_attribute_group_1")
private WebElement sizecheckbox;

@FindBy(id="layered_id_attribute_group_24")
private WebElement coloecheckbox;

@FindBy(id="layered_quantity_1")
private WebElement stockcheckbox;


@FindBy(xpath="//a[@title='Delivery']")
private WebElement delivery;

@FindBy(id="name")
private WebElement nametb;

@FindBy(id="submitWishlist")
private WebElement savebtn;


public WebElement getPricedd() {
return pricedd;
}

public ProductPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
this.driver=driver;
}

public AddtoCartPage productselectd()
{
dress.click();
return new AddtoCartPage(driver);
}

public void dressCatalog()
{
	sizecheckbox.click();
	coloecheckbox.click();
	stockcheckbox.click();
	delivery.click();
}

public void savename()
{
	nametb.sendKeys("testing demo");
	savebtn.click();
}

}

