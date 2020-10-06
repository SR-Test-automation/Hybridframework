package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Propertyfile;
import generic.Utilies;
import page1.AddtoCartPage;
import page1.HomePage;
import page1.LoginPage;
import page1.ProductPage;


public class AddingProductCart extends BaseTest{
	@Test
	public void addingProductCart()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.sigincreditials(Propertyfile.getdatapropertyfile("username"),Propertyfile.getdatapropertyfile("password"));
		Utilies.dropdown(h.getProductsort(),"sortbydd");
		ProductPage p = h.serachingproduct(Propertyfile.getdatapropertyfile("productname"));
		Utilies.dropdown(p.getPricedd(),"price");
		AddtoCartPage c = p.productselectd();
		c.addingtocart();
	}

}
