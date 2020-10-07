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

public class Delivery  extends BaseTest{
@Test
public void productDelivery()
{
	
		LoginPage l=new LoginPage(driver);
		HomePage h = l.sigincreditials(Propertyfile.getdatapropertyfile("username"),Propertyfile.getdatapropertyfile("password"));
		//Utilies.mousehover(driver,h.getDressesTab());
		ProductPage p = h.eveningdress();
		p.dressCatalog();
		
}
}