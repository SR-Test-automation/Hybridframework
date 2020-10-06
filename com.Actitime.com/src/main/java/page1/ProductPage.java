package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
public WebDriver driver;
@FindBy(xpath="//a[@title='Printed Summer Dress']")
private WebElement dress;

@FindBy(id="selectProductSort")
private WebElement pricedd;

@FindBy(xpath="(//a[.='Evening Dresses'])[2]")
private WebElement eveningDress;

@FindBy(id="layered_id_attribute_group_1")
private WebElement sizecheckbox;

@FindBy(id="layered_id_attribute_group_24")
private WebElement coloecheckbox;

@FindBy(id="layered_quantity_1")
private WebElement stockcheckbox;


@FindBy(xpath="//a[@title='Delivery']")
private WebElement delivery;


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

}

