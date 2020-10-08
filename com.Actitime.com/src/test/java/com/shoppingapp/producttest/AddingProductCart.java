package com.shoppingapp.producttest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.shoppingapp.genericlib.BaseTest;
import com.shoppingapp.genericlib.Propertyfile;
import com.shoppingapp.genericlib.Utilies;
import com.shoppingapp.pageslib.AddtoCartPage;
import com.shoppingapp.pageslib.HomePage;
import com.shoppingapp.pageslib.LoginPage;
import com.shoppingapp.pageslib.ProductPage;


public class AddingProductCart extends BaseTest{
	@Test
	public void addingProductCart()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.sigincreditials("bharani@gmail.com","bharani@gmail.com");
		ProductPage p = h.serachingproduct("dress");
		//Utilies.dropdown(h.getProductsort(),Propertyfile.getdatapropertyfile("sortbydd"));
		AddtoCartPage c = p.productselectd();
		c.addbtn();
		//Utilies.dropdown(p.getPricedd(),Propertyfile.getdatapropertyfile("price"));
		c.addingtocart();
	
	}

}
