package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Propertyfile;
import page1.HomePage;
import page1.LoginPage;
import page1.ProductPage;

public class Whislist extends BaseTest{
	@Test
	public void addingtoWhislist()
	{
	LoginPage l=new LoginPage(driver);
	HomePage h = l.sigincreditials(Propertyfile.getdatapropertyfile("username"),Propertyfile.getdatapropertyfile("password"));
ProductPage p = h.wishlist();
p.savename();
}
}