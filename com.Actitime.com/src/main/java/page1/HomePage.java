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
		
		@FindBy(name="(//a[.='Dresses'])[2]")
		private WebElement dressesTab;
		
		@FindBy(id="selectProductSort")
		private WebElement productsort;
		

		public WebElement getProductsort() {
			return productsort;
		}

		public HomePage(WebDriver driver)
		{

		PageFactory.initElements(driver,this);
        this.driver=driver;
		}

		public ProductPage serachingproduct(String product)
		{
		searchtb.sendKeys(product);
		go.click();
		return new ProductPage(driver);
		}
		}



