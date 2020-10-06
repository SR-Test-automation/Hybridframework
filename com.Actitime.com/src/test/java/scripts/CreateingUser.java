package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Propertyfile;
import pages.HomePage;
import pages.LoginPage;

public class CreateingUser  extends BaseTest{
	@Test
	public void createUser()
	{
		LoginPage l=new LoginPage(driver);
	
		l.logincreditails(Propertyfile.getdatapropertyfile("username"),Propertyfile.getdatapropertyfile("password"));
		HomePage h=new HomePage(driver);
		h.addingUser("firstname", "lastname", "email");
	}

}
