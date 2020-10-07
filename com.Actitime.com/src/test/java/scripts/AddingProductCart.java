package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

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
		ProductPage p = h.serachingproduct(Propertyfile.getdatapropertyfile("productname"));
		Utilies.dropdown(h.getProductsort(),Propertyfile.getdatapropertyfile("sortbydd"));
		AddtoCartPage c = p.productselectd();
		c.addbtn();
		Utilies.dropdown(p.getPricedd(),Propertyfile.getdatapropertyfile("price"));
		c.addingtocart();
	
	}

}
