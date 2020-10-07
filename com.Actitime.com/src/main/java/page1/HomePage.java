package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		public WebDriver driver;
		@FindBy(id="search_query_top")
		private WebElement searchtb;

		@FindBy(name="submit_search")
		private WebElement go;
		
		@FindBy(xpath="(//a[.='Evening Dresses'])[2]")
		private WebElement eveningDress;
		
		

		@FindBy(name="(//a[.='Dresses'])[2]")
		private WebElement dressesTab;
		
		public WebElement getDressesTab() {
			return dressesTab;
		}
		@FindBy(xpath="//select[@id='selectProductSort']")
		private WebElement productsort;
		
		@FindBy(xpath="//span[.='My wishlists']")
		private WebElement wishlistbtn;

		public WebElement getProductsort() {
			return productsort;
		}

		public HomePage(WebDriver driver)
		{

		PageFactory.initElements(driver,this);
        this.driver=driver;
		}

		public ProductPage eveningdress()
		{
			eveningDress.click();
			return new ProductPage(driver);
		}
		
		
		public ProductPage serachingproduct(String product)
		{
		searchtb.sendKeys(product);
		go.click();
		return new ProductPage(driver);
		}
		
		public ProductPage wishlist()
		{
		wishlistbtn.click();
		return new ProductPage(driver);
		}
		}



